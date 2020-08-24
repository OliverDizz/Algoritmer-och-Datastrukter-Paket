package Algoritmer_Vecka_14;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Land_main {
    public static void main(String[] args) throws IOException {
        ArrayList<Land> list = new ArrayList();
        Scanner input = new Scanner(new File("src/Algoritmer_Vecka_14/europa.txt"));

        while (input.hasNext()) {
            list.add(new Land(input.next(), input.nextInt(), input.nextInt(), input.next()));
        }
        /*
        //sorting based on name
        Collections.sort(list, new NameComparator());
        Iterator nameiterator = list.iterator();

        while (nameiterator.hasNext()){
            System.out.println(nameiterator.next());
        }
        System.out.println();

        //Sorting based on population
        Collections.sort(list, new PopulationComparator());
        Iterator populationiterator = list.iterator();

        while (populationiterator.hasNext()){
            System.out.println(populationiterator.next());
        }
        System.out.println();

        //Sorting based on country size
        Collections.sort(list, new SizeComparator());
        Iterator sizeiterator = list.iterator();

        while (sizeiterator.hasNext()){
            System.out.println(sizeiterator.next());
        }
        */

        Scanner cmd = new Scanner(new InputStreamReader(System.in));
        System.out.println("Press enter to continue");
        String filepath = "src/Algoritmer_Vecka_14/";
        String filename;
        while (cmd.hasNextLine()) {
            String option =
            System.out.println("Select which method to sort, choose between: name, population or size");
            if (cmd.next().toLowerCase().equals("name")) {
                Collections.sort(list, new NameComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Name.txt";
                FileWriter writer = new FileWriter(new File(filepath + filename));
                while (iterate.hasNext()) {
                    writer.write(iterate.next().toString());
                    writer.write('\n');
                }
                writer.close();
                cmd.close();
                System.out.println("Wrote file " + filename + " successfully");
                break;

            } else if (cmd.nextLine().toLowerCase().equals("population")) {
                Collections.sort(list, new PopulationComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Population.txt";
                FileWriter writer = new FileWriter(new File(filepath + filename));
                while (iterate.hasNext()) {
                    writer.write(iterate.next().toString());
                    writer.write('\n');
                }
                writer.close();
                cmd.close();
                System.out.println("Wrote file " + filename + " successfully");
                break;

            } else if (cmd.nextLine().toLowerCase().equals("size")) {
                Collections.sort(list, new SizeComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Size.txt";
                FileWriter writer = new FileWriter(new File(filepath + filename));
                while (iterate.hasNext()) {
                    writer.write(iterate.next().toString());
                    writer.write('\n');
                }
                writer.close();
                cmd.close();
                System.out.println("Wrote file " + filename + " successfully");
                break;

            } else {
                System.out.println("Please choose one of the options");
            }


        }
    }
}
