package Exceptions.SommaCmdLine;

public class Main {
    public static void main(String[] args) {
        int somma = 0;
        for (String s : args) {
            // Converti s in un intero i
            try {
                int i = Integer.parseInt(s);
                // Aggiungi i alla somma
                somma += i;
            } catch (NumberFormatException e) {
                System.out.println("La stringa \"" + s + "\" non rappresenta un numero: ignorata");
            }
        }
        System.out.println(somma);

    }
}
