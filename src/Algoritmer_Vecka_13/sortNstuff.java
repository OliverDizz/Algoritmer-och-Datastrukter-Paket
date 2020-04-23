package Algoritmer_Vecka_13;

import java.util.Arrays;
import java.util.Random;

public class sortNstuff {
    public static void main(String[] args) {
        int[] a = {2,5,7};
        int[] b = {1,3};
        //System.out.println(Arrays.toString(mergeArrays(a,b)));

        int[] c = {1,2,3,4};
        //System.out.println(isSorted(c));
        int counter = 0;
        int total = 20;
        for (int i = 0; i < total; i++) {

            int[] first = generateRandomArray();
            int[] second = generateRandomArray();
            Arrays.sort(first);
            Arrays.sort(second);
            int[] merged = mergeArrays(first, second);
            if (isSorted(merged)){
                counter++;
            }
        }
        String message = counter + " av " + total + " klarade testen";
        System.out.println(message);

        int[] test = null;
        int[] merged2 = mergeArrays(a, b);











    }
    /*---Metoder---*/

    public static int[] mergeArrays(int[] a, int[] b) {
        int aPos = 0;
        int bPos = 0;
        int mergedPos = 0;

        if (a == null || b == null) {
            throw new IllegalArgumentException("Arrayer kan ej vara null");
        }
        int[] mergedarray = new int[a.length + b.length];

        while(aPos < a.length && bPos < b.length){
            if(a[aPos] < b[bPos]){
                mergedarray[mergedPos++] = a[aPos++];
            }
            else{
                mergedarray[mergedPos++] = b[bPos++];
            }
        }
        while (aPos < a.length) {
            mergedarray[mergedPos++] = a[aPos++];
        }

        while (bPos < b.length) {
            mergedarray[mergedPos++] = b[bPos++];
        }
        return mergedarray;
    }

    public static boolean isSorted(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int[] generateRandomArray(){
        Random random = new Random();
        //skapar array med 1-25 platser
        int[] a = new int[random.nextInt(24) + 1];

        //fyller array med random nummer 1-100
        for (int i = 0; i < a.length; i++) {
            int temp = random.nextInt(99) + 1;
            a[i] = temp;
        }

        return a;
    }


}

