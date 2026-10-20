package homeworks;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class ArrayHomework {
    public static void main(String[] args) {

        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը

        int[] numbers =  {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};

        int n = 6;

        int count = 0;

        for (int number : numbers) {

            if (number == n) {

                count++;
            }
        }
        System.out.println("count of"+ n + ":" + count);

       // Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը

        int[] num = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};

        for (int i = 0; i < num.length/2; i++) {

            int val = num[i];

            num[i] = num[num.length - 1 - i ];

            num[num.length - 1 - i] = val;
        }
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]+ " ");
        }
        System.out.println();

        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը

        int[] number = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};

        int[] counts = new int [10];

        for (int i = 0; i < number.length; i++) {

            int element = number[i];

            counts[element]++;
        }
        int repeatedCount = 0;

        for (int i = 0; i < counts.length; i++) {

            if (counts[i]>1) {

                repeatedCount++ ;
            }
        }
        System.out.println("Repeated numbers count:" + repeatedCount);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ',};

        int vowelsCount = 0;

        for (int i = 0; i < chars.length; i++) {

            char current = chars[i];

            for (int j = 0; j < vowels.length; j++) {

                if (current == vowels[j]) {

                    vowelsCount++;
                }
            }

        }
        System.out.println("Vowels count:" + vowelsCount);

        // ⭐ Լրացուցիչ առաջադրանքներ (Bonus)

        // Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը

        int[] numbers2 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};

        int max = numbers[0];

        for (int i = 0; i < numbers2.length; i++) {

            if(numbers[i]>max) {

                max = numbers2[i];
            }
        }
        int secondMax = numbers2[0];

        for (int i = 0; i < numbers2.length; i++) {

            if (numbers2[i] > secondMax && numbers2[i] < max) {

                secondMax = numbers2[i];
            }
        }
        System.out.println("Second max number:"+ secondMax);

        //Bonus 2 — Հեռացնել կրկնվող թվերը

        int[] numbers3 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};

        for (int i = 0; i < numbers3.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if(numbers3[i]==numbers3[j]) {

                    isDuplicate = true;

                    break;
                }

            }
            if(!isDuplicate) {

                System.out.print(numbers3[i] + " ");
            }
        }
        System.out.println();

        // Bonus 3 — Գտնել ամենաշատ կրկնվող թիվը

        int[] numbers4 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};

        int mostFrequent = numbers4[0];

        int max2 = 0;

        for (int i = 0; i < numbers4.length; i++) {

            int count2 = 0;

            for (int j = 0; j < numbers4.length; j++) {

                if(numbers4[i] == numbers4[j]) {

                     count2++;
                }
            }
            if(count2 > max2) {

                max2 = count2;

                mostFrequent = numbers4[i];
            }
        }
        System.out.println("Most frequent number:" + mostFrequent);
        System.out.println("Count:" + max2);

    }
}
