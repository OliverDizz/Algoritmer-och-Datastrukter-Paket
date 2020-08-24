package Algoritmer_Vecka_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Land_main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Land> list = new ArrayList();
        Scanner input = new Scanner(new File("/Users/oliverdizdarevic/IdeaProjects/Algoritmer och Datastrukturer Paket/src/Algoritmer_Vecka_14/europa.txt"));

        while(input.hasNext()){
            list.add(new Land(input.next(), input.nextInt(), input.nextInt(), input.next()));
        }

        Collections.sort(list, new NameComparator());
        Iterator<ArrayList> iterate= new list.iterator();


    }
}
