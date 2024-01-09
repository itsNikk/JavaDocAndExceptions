package Exceptions.FindCharNoExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // data una stringa str e un int index
        // stampa in carattere c nella posizione index se possibile, altrimenti PROBLEMA.

        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci una stringa:> ");
        String str = s.nextLine();
        System.out.print("Inserisci un intero:> ");
        int index = s.nextInt();


        if (isValidIndex(index, str)) {
            char c = str.charAt(index);
            System.out.println("Il carattere in posizione " + index + " della stringa " + str + " è " + c);
        } else {
            System.out.println("Non c'è un carattere in posizione" + index);
        }
    }

    public static boolean isValidIndex(int index, String s) {
        return index >= 0 && index < s.length();
    }
}
