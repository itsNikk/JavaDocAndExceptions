package Exceptions.STP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaTrasporto sistema = new SistemaTrasporto();
        sistema.aggiungiFermata("Fermata A");
        sistema.aggiungiFermata("Fermata B");
        try {
            sistema.aggiungiTragitto("Fermata A", "Fermata B");
            sistema.aggiungiTragitto("Fermata A", "Fermata C");
        } catch (FermataNonTrovataException | TragittoAnnullatoException e) {
            System.out.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci fermata di partenza: ");
        String partenza = scanner.nextLine();

        System.out.print("Inserisci fermata di destinazione: ");
        String destinazione = scanner.nextLine();

        System.out.print("Il biglietto è scaduto? (true/false): ");
        boolean bigliettoScaduto = scanner.nextBoolean();

        try {
            sistema.prenotaViaggio(partenza, destinazione, bigliettoScaduto);
        } catch (BigliettoScadutoException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
