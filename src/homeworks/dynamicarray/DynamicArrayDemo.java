package homeworks.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        //Թեստ 1 — Ավելացնել էլեմենտներ
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);
        da.add(25);

        da.print();
        System.out.println();

        //Թեստ 2 — Զանգվածի մեծացում
        DynamicArray da2 = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            da2.add(i);
        }

        da2.print();
        System.out.println();

        // Թեստ 3 — getByIndex(int index)
        DynamicArray da3 = new DynamicArray();

        da.add(10);
        da.add(20);
        da.add(30);

        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(2));
        System.out.println(da.getByIndex(5));
        System.out.println(da.getByIndex(-1));

        System.out.println();

        //Թեստ 3 — Կրկնակի մեծացում
        DynamicArray da4 = new DynamicArray();

        for (int i = 1; i <= 25; i++) {
            da4.add(i);
        }

        da4.print();
        System.out.println();

        //Թեստ 4 — print()
        DynamicArray da5 = new DynamicArray();

        da.add(4);
        da.add(8);
        da.add(12);

        da.print();
        System.out.println();

        //Թեստ 4 — Ինդեքսով ստանալ էլեմենտ
        DynamicArray da6 = new DynamicArray();

        da6.add(10);
        da6.add(20);
        da6.add(30);

        //Առաջին էլեմենտի ինդեքսը։
        System.out.println(da6.getByIndex(0));
        //Վերջին ավելացված էլեմենտի ինդեքսը։
        System.out.println(da6.getByIndex(2));
        //Բացասական ինդեքսը։
        System.out.println(da6.getByIndex(-1));
        //Գոյություն չունեցող ինդեքսը։
        System.out.println(da6.getByIndex(5));

        //Դատարկ զանգվածի դեպքում getByIndex(0)-ը։
        DynamicArray empty = new DynamicArray();
        System.out.println(empty.getByIndex(0));


    }
}

