package homeworks;

public class CharArrayUtil {

    public static void main(String[] args) {

        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        //Խնդիր 1 — Տպել բոլոր սիմվոլները

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //Խնդիր 2 — Հաշվել սիմվոլների քանակը

        System.out.println("Characters count:" + chars.length);
        System.out.println("First character:" + chars[0]);
        System.out.println("Last character:" + chars[chars.length - 1]);

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը

        char c = 'a';
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Character 'a' count:" + count);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count1++;
                    break;
            }
        }
        System.out.println("Vowels count:" + count1);

        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը

        int count2 = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;

                default:
                    if (chars[i] != ' ' && chars[i] != '!') {
                        count2++;
                    }
                    break;
            }
        }
        System.out.println("Consonants count:" + count2);


        //Խնդիր 6 — Հաշվել բացատների քանակը

        int count3 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count3++;
            }
        }
        System.out.println("Spaces count:" + count3);

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը

        char[] chars1 = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        System.out.print("Uppercase:");

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'a' && chars1[i] <= 'z') {
                chars1[i] = (char) (chars1[i] - 32);
            }
            System.out.print(chars1[i]);
        }
        System.out.println();
        System.out.print("Lowercase:");
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'A' && chars1[i] <= 'Z') {
                chars1[i] = (char) (chars1[i] + 32);
            }
            System.out.print(chars1[i]);
        }
        System.out.println();

        //Խնդիր 9 — Փոխարինել տրված սիմվոլը

        char[] chars2 = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == oldChar) {
                chars2[i] = newChar;
            }
            System.out.print(chars2[i]);
        }
        System.out.println();

        //Խնդիր 10 — Ստուգել Palindrome-ը

        char[] chars3 = {'l', 'e', 'v', 'e', 'l'};

        boolean isPalindrome = true;

        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] != chars3[chars3.length - 1 - i]) {
                isPalindrome = false;
            }
        }
        System.out.println("Is palindrome:" + isPalindrome);

        char[] chars4 = {'h', 'e', 'l', 'l', 'o'};

        boolean isPalindrome1 = true;

        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] != chars4[chars4.length - 1 - i]) {
                isPalindrome1 = false;
            }
        }
        System.out.println("Is palindrome:" + isPalindrome1);

        //Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը

        char[] chars5 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';

        int index = -1;

        for (int i = 0; i < chars5.length; i++) {
            if (chars5[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First index:" + index);

        //Bonus 2 — Համեմատել երկու char զանգված

        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean areEqual = true;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                areEqual = false;
            }
        }
        System.out.println("Arrays are equal:" + areEqual);

        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները

        char[] chars6 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < chars6.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (chars6[i] == chars6[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(chars6[i] + " ");
            }
        }
    }
}
