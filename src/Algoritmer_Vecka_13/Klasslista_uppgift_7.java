package Algoritmer_Vecka_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Klasslista_uppgift_7 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File fil = new File("/Users/oliverdizdarevic/IdeaProjects/Algoritmer och Datastrukturer Paket/src/Algoritmer_Vecka_13/KlasslistaFixed.txt");
        Scanner input = new Scanner(fil);

        //fills ArrayList with names from file
        while (input.hasNextLine()) {
            addToList(list, input.nextLine());

        }
        input.close();
        listPrint(list);
        System.out.println(isSorted(list));


         /*
        //First test
        ArrayList<String> test = new ArrayList<>();
        test.add("A");
        test.add("B");
        test.add("D");
        addToList(test, "C");
        listPrint(test);
        System.out.println(isSorted(test));
        */


    }

    /*---METHODS---*/
    public static String findName(ArrayList<String> list, int index) {
        return (String) list.get(index);
    }

    public static boolean deleteName(ArrayList<String> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name.toLowerCase())) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean addToList(ArrayList<String> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if (item.compareToIgnoreCase(name) > 0) {
                list.add(i, name);
                return true;
            }
        }
        list.add(name);
        return false;
    }

    public static void listPrint(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String item_1 = list.get(i);
            String item_2 = list.get(i + 1);
            if (item_1.compareToIgnoreCase(item_2) > 0) {
                return false;
            }
        }
        return true;
    }
}
