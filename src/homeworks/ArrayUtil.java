package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        System.out.println( );

        //Խնդիր 2 — Տպել առաջին էլեմենտը

        System.out.println(numbers[0]);

        //Խնդիր 3 — Տպել վերջին էլեմենտը

        System.out.println(numbers[numbers.length-1]);

        //Խնդիր 4 — Տպել զանգվածի երկարությունը

        System.out.println(numbers.length);

        //Խնդիր 5 — Գտնել ամենափոքր թիվը

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i]< min) {

                min = numbers[i];
            }

        }
        System.out.println("min="+ min);

        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները

        if(numbers.length <= 2) {

            System.out.println("Can't print middle values");
        }
        else if (numbers.length % 2 == 1) {

            System.out.println("Middle element:" + numbers[numbers.length/2]);
        }

        else {
            int mid1 = numbers.length/2-1;

            int mid2= numbers.length/2;

            System.out.println("Middle element:"+ numbers[mid1]+" "+numbers[mid2]);

        }

        //Խնդիր 7 — Հաշվել զույգ թվերի քանակը

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 ==0) {

                result++;
            }
        }
        System.out.println("Even numbers count:" + result);

        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը

        int resultOdd = 0;

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 != 0) {
                resultOdd++;
            }
        }
        System.out.println("Odd numbers count:" + resultOdd);

        //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը

        int resultSum = 0;

        for (int i = 0; i < numbers.length; i++) {

             resultSum = resultSum + numbers[i];
        }


        System.out.println("Sum:" + resultSum);

        //Խնդիր 10 — Հաշվել միջին թվաբանականը

        double sum = 0;

        for (int i = 0; i < numbers.length ; i++) {

            sum = sum + numbers[i];

        }
        double average = sum / numbers.length;

        System.out.println("Average:" + average);

       // Լրացուցիչ առաջադրանքներ (Bonus)

        //Bonus 1 — Գտնել ամենամեծ թիվը

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i] > max){

                max = numbers[i];
            }
        }
        System.out.println("max=" + max);

        //Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ


        for (int i = numbers.length-1; i>=0; i--) {

            System.out.print(numbers[i]+ " ");

            
        }

    }
}
