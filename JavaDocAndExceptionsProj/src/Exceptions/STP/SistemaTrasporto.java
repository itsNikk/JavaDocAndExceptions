package Exceptions.STP;


import java.util.ArrayList;
import java.util.List;

// Questa classe  gestisce le prenotazioni e gli utilizzi del trasporto pubblico
class SistemaTrasporto {
    private final List<Fermata> fermate;
    private final List<Tragitto> tratte;

    public SistemaTrasporto() {
        fermate = new ArrayList<>();
        tratte = new ArrayList<>();
    }

    public void aggiungiFermata(String nomeFermata) {
        fermate.add(new Fermata(nomeFermata));
    }

    public void aggiungiTragitto(String partenza, String destinazione) throws FermataNonTrovataException {
        Fermata fermataPartenza = cercaFermata(partenza);
        Fermata fermataDestinazione = cercaFermata(destinazione);
        tratte.add(new Tragitto(fermataPartenza, fermataDestinazione));
    }

    public void prenotaViaggio(String partenza, String destinazione, boolean bigliettoScaduto) throws BigliettoScadutoException {
        try {
            Fermata fermataPartenza = cercaFermata(partenza);
            Fermata fermataDestinazione = cercaFermata(destinazione);
            Tragitto tragitto = cercaTragitto(fermataPartenza, fermataDestinazione);

            if (bigliettoScaduto) throw new BigliettoScadutoException("Il biglietto è scaduto.");

            // Simulazione di un'utilizzo del trasporto pubblico
            System.out.println("Viaggio prenotato con successo da " +
                    tragitto.getPartenza().getNome() + " a " + tragitto.getDestinazione().getNome());
        } catch (FermataNonTrovataException | TragittoAnnullatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    private Fermata cercaFermata(String nomeFermata) throws FermataNonTrovataException {
        for (Fermata fermata : fermate) {
            if (fermata.getNome().equalsIgnoreCase(nomeFermata)) {
                return fermata;
            }
        }
        throw new FermataNonTrovataException("Fermata non trovata: " + nomeFermata);
    }

    private Tragitto cercaTragitto(Fermata partenza, Fermata destinazione) throws TragittoAnnullatoException {
        for (Tragitto tragitto : tratte) {
            if (tragitto.getPartenza().equals(partenza) && tragitto.getDestinazione().equals(destinazione)) {
                return tragitto;
            }
        }
        throw new TragittoAnnullatoException("Tragitto annullato: " + partenza.getNome() + " - " + destinazione.getNome());
    }
}