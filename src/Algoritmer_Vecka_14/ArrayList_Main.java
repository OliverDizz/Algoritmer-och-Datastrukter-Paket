package Algoritmer_Vecka_14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

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

        MyArrayList<Account> mylist = new MyArrayList<>();
        Account account1 = new Account("1",0);
        Account account2 = new Account("2",0);
        Account account3 = new Account("3",0);
        Account account4 = new Account("4",0);
        mylist.add(account1);
        mylist.add(account2);
        mylist.add(account3);
        mylist.add(account4);

        ArrayListIterator<Account> iterator = new ArrayListIterator(mylist.toArray(), mylist.size());
        Random rand = new Random();
        while (iterator.hasNext()){
            iterator.next().deposit(rand.nextInt(5001)+1000);
        }

        System.out.println(mylist.toString());
        //MyArrayList implementerar inte list klassen och är inte då kompatibel
        // Collections.sort(mylist);
        



    }
}
