package Exceptions.ControlledExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();


        try {
            ValidaInput(str);
            System.out.println("Stringa valida");
        } catch (ValidationException ve) {
            //preferibile getMessage() ad un messaggio custom
            System.out.println(ve.getMessage());
            //System.out.println("Stringa non valida");
        }


    }

    public static void ValidaInput(String s) throws ValidationException {
        if (s.length() < 5) throw new ValidationException("Stringa piuù corta di 5 caratteri");
    }
}
