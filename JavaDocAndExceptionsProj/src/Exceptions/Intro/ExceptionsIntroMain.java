package Exceptions.Intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsIntroMain {
    public static void main(String[] args) {
        /*
         *   Gestione condizioni malsane/patologiche del programma.
         *   esempio: errori di input, dati non disponibili, dati invalidi, ecc
         *
         *   throw = un modulo/metodo GENERA un'eccezione quando si verifica una condizione anomala
         *   catch = un modulo/metodo GESTISCE un'eccezione generata da qualche modulo/metodo
         *
         *   madre di tutte le Eccezioni = Throwable
         *
         */

        int[] array = null;
        int index = 0;
        try {
            index = array.length - Integer.MAX_VALUE;
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            if (index > array.length - 1) System.out.println(array[array.length - 1]);
            if (index < 0) System.out.println(array[0]);
        } catch (NullPointerException npe) {
            array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci NUMERO:> ");
        int v = 0;
        try {
            v = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.print("Hai sbagliato, devi inserire un numero!");
            try {
                scanner.nextLine();
                v = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Hai sbasdfagliato ancora. Chiudo il programma.");
                System.exit(0);
            }
        }

        System.out.println(v);

        try {
            double res = 5 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        }
    }
}
