package Exceptions.SVS.VotingSystem;

import Exceptions.SVS.CustomExceptions.CanzoneGiaVotataException;
import Exceptions.SVS.CustomExceptions.CanzoneNonTrovataException;
import Exceptions.SVS.CustomExceptions.LimiteVotiSuperatoException;
import Exceptions.SVS.CustomExceptions.VotoInvalidoException;

public class Votazione {
    private Canzone[] canzoni;
    private Votante[] votanti;
    private final int LIMITE_TOTALE_VOTI = 50;

    public Votazione(Canzone[] canzoni, Votante[] votanti) {
        this.canzoni = canzoni;
        this.votanti = votanti;
    }

    public void votaCanzone(Votante votante, String titolo, int voto)
            throws CanzoneNonTrovataException, VotoInvalidoException, LimiteVotiSuperatoException {
        try {
            boolean trovato = false;
            for (Canzone canzone : canzoni) {
                if (canzone.getTitolo().equals(titolo)) {
                    votante.assegnaVoto(canzone, voto);
                    trovato = true;
                    break;
                }
            }
            if (!trovato) {
                throw new CanzoneNonTrovataException("La canzone con titolo '" + titolo + "' non è presente nell'elenco.");
            }

            int totaleVoti = 0;
            for (Canzone canzone : canzoni) {
                totaleVoti += canzone.getVoti();
            }

            if (totaleVoti > LIMITE_TOTALE_VOTI) {
                throw new LimiteVotiSuperatoException("Il totale dei voti ha superato il limite massimo consentito.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice non valido nell'array delle canzoni.");
        } catch (CanzoneGiaVotataException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
