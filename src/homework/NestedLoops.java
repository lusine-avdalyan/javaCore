package homework;

public class NestedLoops {
    public static void main(String[] args) {
        // 1-ին առաջադրանք

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // 2-րդ առաջադրանք

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3-րդ առաջադրանք

        for (int i = 0; i < 5; i++) {

            for (int j = 4; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 4-րդ առաջադրանք

        for (int i = 5; i > 0 ; i--) {

            for (int j = i; j < 5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        // 5-րդ առաջադրանքը չեմ գտնում ճիշտ ձևը բացատները դնելու, չեմ կարողանում պատկերը ստանալ



            }

        }



    }
}






