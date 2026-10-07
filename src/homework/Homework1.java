package homework;

public class Homework1 {
    public static void main(String[] args) {
        // 1-ին խնդիր
        int x = 13;
        int y = 19;
        if (x > y) {
            System.out.println(" x ը մեծ է y ից");
        } else if (y > x) {
            System.out.println("y ը մեծ է x ից");
        } else {
            System.out.println("x ը և y ը հավասար են");
        }

        // 2-րդ խնդիր
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 3-րդ խնդիր
        int a = 5;
        int b = 7;
        int num = a + b;
        System.out.println(num);

        // 4-րդ խնդիր
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}
