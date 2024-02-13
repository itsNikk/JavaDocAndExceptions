package Exceptions.SVS.VotingSystem;

import Exceptions.SVS.CustomExceptions.CanzoneGiaVotataException;
import Exceptions.SVS.CustomExceptions.CanzoneNonTrovataException;
import Exceptions.SVS.CustomExceptions.VotoInvalidoException;

public class Canzone {
    private String titolo;
    private String artista;
    private int voti;

    public Canzone(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
        this.voti = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    public int getVoti() {
        return voti;
    }

    public void aggiungiVoto(int voto) throws VotoInvalidoException, CanzoneGiaVotataException {
        if (voto < 1 || voto > 10) {
            throw new VotoInvalidoException("Il voto deve essere compreso tra 1 e 10.");
        }

        if (voti > 0) {
            throw new CanzoneGiaVotataException("La canzone ha già ricevuto un voto.");
        }

        this.voti += voto;
    }
}
