package Algoritmer_Vecka_14;

import java.io.*;
import java.util.ArrayList;
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
        String filepath = "src/Algoritmer_Vecka_14/";

        do {
            System.out.println("Select which method to sort, choose between: name, population or size");
            String option = cmd.next().toLowerCase();
            String filename;
            if ("name".equals(option)) {
                list.sort(new NameComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Name.txt";
                WriteToFile(cmd, filepath, filename, iterate);
                break;
            } else if ("population".equals(option)) {
                list.sort(new PopulationComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Population.txt";
                WriteToFile(cmd, filepath, filename, iterate);
                break;
            } else if ("size".equals(option)) {
                list.sort(new SizeComparator());
                Iterator iterate = list.iterator();
                filename = "Sorted_by_Size.txt";
                WriteToFile(cmd, filepath, filename, iterate);
                break;
            } else {
                System.out.println("Please choose one of the options, press enter to continue");
            }


        } while (cmd.hasNextLine());
    }

    private static void WriteToFile(Scanner cmd, String filepath, String filename, Iterator iterate) throws IOException {
        FileWriter writer = new FileWriter(new File(filepath + filename));
        while (iterate.hasNext()) {
            writer.write(iterate.next().toString());
            writer.write('\n');
        }
        writer.close();
        cmd.close();
        System.out.println("Wrote file " + filename + " successfully");
    }
}
