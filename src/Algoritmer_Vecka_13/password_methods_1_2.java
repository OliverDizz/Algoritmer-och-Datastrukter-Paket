package Algoritmer_Vecka_13;
import java.util.Random;

public class password_methods_1_2 {
    public static void main(String[] args) {
        int antal = 1000;
        int correct = 0;
        boolean whatever;
        for (int i = 0; i < antal; i++) {
            String pass = new String(generatePassword());
            System.out.println(pass);
            whatever = passwordCheck(pass);
            System.out.println(whatever);
            if(whatever){
                correct++;
            }
        }
        System.out.println("Antal korrekta lösenord: " + correct + "/" + antal);


    }

    public static char[] generatePassword() {
        Random rand = new Random();
        int length = rand.nextInt(5) + 8;
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int choice = rand.nextInt(characters.length());
            password[i] = characters.charAt(choice);
        }

        return password;
    }

    public static boolean passwordCheck(String password) {
        return password.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,12}");
    }



}
