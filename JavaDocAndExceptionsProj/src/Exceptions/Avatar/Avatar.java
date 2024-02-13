package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.ArmaMalfunzionanteException;
import Exceptions.Avatar.CustomExceptions.AttaccoFallitoException;
import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

public class Avatar {
    private static final double PERFORM_ATTACK_PROB = 0.5;
    private static final double ATTACK_SUCCESS_PROB = 0.8;
    private String nome;
    private String arma;
    private int esperienza;

    public Avatar(String nome, String arma, int esperienza) {
        this.nome = nome;
        this.arma = arma;
        this.esperienza = esperienza;
    }

    public void attacca(RDA rda) throws ArmaMalfunzionanteException, AttaccoFallitoException, DifesaInsufficienteException, UnobtaniumEsauritoException {
        if (Math.random() < PERFORM_ATTACK_PROB) {
            if (Math.random() < ATTACK_SUCCESS_PROB) {
                System.out.println(nome + " attacca con successo la postazione RDA!");
                rda.difendi(esperienza);
            } else {
                throw new ArmaMalfunzionanteException("L'arma di " + nome + " non funziona bene!");
            }
        } else {
            throw new AttaccoFallitoException("L'attacco di " + nome + " non ha successo nel neutralizzare la postazione RDA.");
        }
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "nome='" + nome + '\'' +
                ", arma='" + arma + '\'' +
                ", esperienza=" + esperienza +
                '}';
    }
}
