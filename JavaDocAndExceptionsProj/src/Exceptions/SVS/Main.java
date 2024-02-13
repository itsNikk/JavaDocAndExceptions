package Exceptions.SVS;

import Exceptions.SVS.CustomExceptions.CanzoneNonTrovataException;
import Exceptions.SVS.CustomExceptions.LimiteVotiSuperatoException;
import Exceptions.SVS.CustomExceptions.VotoInvalidoException;
import Exceptions.SVS.VotingSystem.Canzone;
import Exceptions.SVS.VotingSystem.Votante;
import Exceptions.SVS.VotingSystem.Votazione;

public class Main {
    public static void main(String[] args) {
        Canzone[] canzoni = {
                new Canzone("Canzone 1", "Artista 1"),
                new Canzone("Canzone 2", "Artista 2"),
                new Canzone("Canzone 3", "Artista 3")
        };

        Votante[] votanti = {
                new Votante("Votante 1", 20),
                new Votante("Votante 2", 30)
        };

        Votazione votazione = new Votazione(canzoni, votanti);

        try {
            votazione.votaCanzone(votanti[0], "Canzone 1", 8);
            votazione.votaCanzone(votanti[1], "Canzone 2", 6);
            votazione.votaCanzone(votanti[0], "Canzone 4", 7); // Genera eccezione CanzoneNonTrovataException

        } catch (CanzoneNonTrovataException | VotoInvalidoException | LimiteVotiSuperatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            votazione.votaCanzone(votanti[1], "Canzone 3", 15); // Genera eccezione VotoInvalidoException
        } catch (CanzoneNonTrovataException | VotoInvalidoException | LimiteVotiSuperatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {
            votazione.votaCanzone(votanti[0], "Canzone 1", 5); // Genera eccezione LimiteVotiSuperatoException
        } catch (CanzoneNonTrovataException | VotoInvalidoException | LimiteVotiSuperatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        for (Canzone canzone : canzoni) {
            System.out.println(canzone.getTitolo() + " - " + canzone.getArtista() + " - Voti: " + canzone.getVoti());
        }

        for (Votante votante : votanti) {
            System.out.println(votante.getNome() + " - Budget Voti: " + votante.getBudgetVoti());
        }
    }
}

