package Algoritmer_Vecka_14;

import java.util.ArrayList;
import java.util.Collections;

public class Account_Main {
    public static void main(String[] args) {
        Account Oliver = new Account("1",100);
        Account Erik = new Account("2",300);
        Account Gustav = new Account("3",200);

        ArrayList<Account> list= new ArrayList<>();
        list.add(Oliver);
        list.add(Erik);
        list.add(Gustav);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
