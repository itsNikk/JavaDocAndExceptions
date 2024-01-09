package Exceptions.FindCharConExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci una stringa:> ");
        String str = s.nextLine();
        System.out.print("Inserisci un intero:> ");
        int index = s.nextInt();

        try {
            char c = str.charAt(index);
            System.out.println("Il carattere in posizione " + index + " della stringa " + str + " è " + c);
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            System.out.println("Non c'è un carattere in posizione " + index);
        }
    }
}
