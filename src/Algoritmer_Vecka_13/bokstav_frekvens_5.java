package Algoritmer_Vecka_13;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bokstav_frekvens_5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/vecka_13_Javagrunder_genomgång/lorem_ipsum.txt"));
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[alfabet.length()];
        int total = 0;
        DecimalFormat df = new DecimalFormat("#.###");

        while (scan.hasNext()) {
            String word = scan.next().toUpperCase();
            for (int i = 0; i < word.length(); i++) {
                for (int j = 65; j < 91; j++) {
                    if((int)word.charAt(i) == j){
                        count[j-65]++;
                    }
                }
                total++;
            }
        }
        System.out.println("Bokstav antal frekv");
        for (int i = 0; i < alfabet.length(); i++) {
            Double frekvens = (double)count[i]/total;
            String message = alfabet.charAt(i) + "       " + count[i] + "   " +  df.format(frekvens)+ "%";
            System.out.println(message);
        }




    }
}
