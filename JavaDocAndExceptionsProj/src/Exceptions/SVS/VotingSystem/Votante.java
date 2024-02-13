package Exceptions.SVS.VotingSystem;

import Exceptions.SVS.CustomExceptions.CanzoneGiaVotataException;
import Exceptions.SVS.CustomExceptions.LimiteVotiSuperatoException;
import Exceptions.SVS.CustomExceptions.VotoInvalidoException;

public class Votante {
    private String nome;
    private int budgetVoti;

    public Votante(String nome, int budgetVoti) {
        this.nome = nome;
        this.budgetVoti = budgetVoti;
    }

    public String getNome() {
        return nome;
    }

    public int getBudgetVoti() {
        return budgetVoti;
    }

    public void assegnaVoto(Canzone canzone, int voto)
            throws VotoInvalidoException, LimiteVotiSuperatoException, CanzoneGiaVotataException {
        if (voto < 1 || voto > 10) {
            throw new VotoInvalidoException("Il voto deve essere compreso tra 1 e 10.");
        }

        if (budgetVoti - voto < 0) {
            throw new LimiteVotiSuperatoException("Il budget di voti di " + nome + " è insufficiente per assegnare questo voto.");
        }

        canzone.aggiungiVoto(voto);
        budgetVoti -= voto;
    }
}
