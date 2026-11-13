package homeworks.bracechecker;

import java.util.Stack;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Error: extra closing brace at " + i);
                    return;
                }
                char last = stack.pop();

                if (last == '(' && ch != ')' ||
                        last == '[' && ch != ']' ||
                        last == '{' && ch != '}') {

                    System.out.println("Error: opened " + last
                            + " but closed " + ch + " at " + i);
                    return;

                }
            }
        }
        if (!stack.isEmpty()) {
            char last = stack.peek();
            System.out.println("Error: unclosed " + last);
            return;
        }

        System.out.println("No errors");

    }
}
