package Algoritmer_Vecka_13;

import java.util.Arrays;

public class add_at_index_3 {
    public static void main(String[] args) {
        //index för stor
        int[] test = {1, 2, 3, 4, 5};
        test = addAtIndex(test, 7, 10);
        System.out.println(Arrays.toString(test));

        //array tom
        int[] test2 = {0, 0, 0, 0, 0};
        test2 = addAtIndex(test2, 10, 2);
        System.out.println(Arrays.toString(test2));
        //array full
        int[] test3 = {1, 2, 3, 4, 5};
        test3 = addAtIndex(test3, 7, 2);
        System.out.println(Arrays.toString(test3));

        //index upptagen
        int[] test4 = {1, 2, 3, 0, 0};
        test4 = addAtIndex(test4, 10, 2);
        System.out.println(Arrays.toString(test4));

        //index ledigt
        int[] test5 = {1, 2, 0, 4, 5};
        test5 = addAtIndex(test5, 10, 2);
        System.out.println(Arrays.toString(test5));
    }

    //metoder
    public static int[] addAtIndex(int[] a, int x, int index) {
        boolean full = true;
        int emptyposition = 0;

        if(index > a.length){
            System.out.println("Index out of bonds");
            return a;
        }
        //om index är ledigt så sätts den in, annars så kollar den om array är full
        if(a[index] == 0){
            a[index] = x;
            return a;
        }
        else {
            //kollar om arrayen är full efter index
            for (int i = index; i < a.length; i++) {
                if (a[i] == 0) {
                    emptyposition = i;
                    full = false;
                    break;
                }
            }
        }

        //dubblar arrayen om den är full efter index
        if (full == true) {
            int[] newarray = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                newarray[i] = a[i];
            }
            emptyposition = a.length;
            a = newarray;
        }
        else{

        }

        //flyttar element höger om index ett steg
        for (int i = emptyposition; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = x;
        return a;
    }
}
