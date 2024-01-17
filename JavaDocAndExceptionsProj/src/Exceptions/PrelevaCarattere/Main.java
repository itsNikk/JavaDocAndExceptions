package Exceptions.PrelevaCarattere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci una stringa:> ");
        String str = s.nextLine();
        System.out.print("Inserisci un intero positivo:> ");
        int index = s.nextInt();

        ManageInput(str, index);
    }

    public static void ManageInput(String str, int index) {
        try {
            char c = str.charAt(index);
            System.out.println("Il carattere in posizione " + index + " della stringa " + str + " è " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Non esiste alcun carattere in posizone " + index);
        }
    }
}
