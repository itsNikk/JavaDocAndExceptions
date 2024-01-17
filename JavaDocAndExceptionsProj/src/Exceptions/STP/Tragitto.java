package Exceptions.STP;

public class Tragitto {
    private Fermata partenza;
    private Fermata destinazione;

    public Tragitto(Fermata partenza, Fermata destinazione) {
        this.partenza = partenza;
        this.destinazione = destinazione;
    }

    public Fermata getPartenza() {
        return partenza;
    }

    public Fermata getDestinazione() {
        return destinazione;
    }
}
