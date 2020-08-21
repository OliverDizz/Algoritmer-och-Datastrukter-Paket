package Algoritmer_Vecka_14;

import java.util.Iterator;

public class ArrayList_Main {
    public static void main(String[] args) {
        MyArrayList<String> test = new MyArrayList<String>();
        test.add("Oliver");
        test.add("Igor");
        test.add("Alex");
        test.add("Fabian");

        test.print();
        System.out.println(test.size());
        System.out.println(test.contains("Fabian"));
        System.out.println(test.get(2));
        System.out.println(test.indexOf("Alex"));

        test.remove("Fabian");
        test.print();




    }
}
