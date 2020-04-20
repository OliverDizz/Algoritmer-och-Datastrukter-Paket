package vecka_13_Javagrunder_genomgång;

import java.util.Arrays;

public class sortNstuff {
    public static void main(String[] args) {
        int[] a = {2,5,7};
        int[] b = {1,3};
        System.out.println(Arrays.toString(mergeArrays(a,b)));









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
}

