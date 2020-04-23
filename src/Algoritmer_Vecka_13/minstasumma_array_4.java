package Algoritmer_Vecka_13;

import java.util.Random;

public class minstasumma_array_4 {
    public static void main(String[] args) {
        int[][] nico = {{4, 3, 8, 7, 2, 7}, {2, 8, 8, 9, 3, 5}, {1, 4, 1, 9, 4, 2}, {2, 8, 3, 9, 5, 9}, {9, 9, 8, 3, 1, 7}, {5, 6, 1, 3, 7, 2}, {9, 2, 2, 5, 6, 3}, {1, 3, 3, 8, 3, 1}, {8, 4, 6, 8, 2, 5}};
        // int[][] matris = matrixGenerator();
        arrayPrinter2(nico);
        System.out.println("");

        array2sum(nico);


    }

    /*----metoder----*/

    //Genererar en random matris med random och kolumner 3-20
    public static int[][] matrixGenerator() {
        Random rand = new Random();
        int[][] matris = new int[rand.nextInt(18) + 3][rand.nextInt(18) + 3];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j] = rand.nextInt(9) + 1;
            }
        }
        return matris;
    }

    //Printar ut en 2D array
    public static void arrayPrinter2(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            System.out.println();
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]);
                System.out.print(" ");
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int array2sum(int[][] a) {
        int smallest = sum(a[0]);

        String plats = "";
        int platsnummer = 0;
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            //räknar ut raden med minsta summan
            if (sum(a[i]) < smallest) {
                smallest = sum(a[i]);
                plats = "rad";
                platsnummer = i;
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[j] = a[j][i];
            }
            //räknar ut kolumnen med minsta summan
            if (sum(temp) < smallest) {
                smallest = sum(temp);
                plats = "kolumn";
                platsnummer = i;
            }
        }

        String message = plats + " " + platsnummer + " har matrisens minsta summa " + smallest;
        System.out.println(message);
        return smallest;
    }
}



