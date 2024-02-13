package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.ArmaMalfunzionanteException;
import Exceptions.Avatar.CustomExceptions.AttaccoFallitoException;
import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

public class Avatar {
    private String nome;
    private String arma;
    private int esperienza;

    public Avatar(String nome, String arma, int esperienza) {
        this.nome = nome;
        this.arma = arma;
        this.esperienza = esperienza;
    }

    public void attacca(RDA rda) throws ArmaMalfunzionanteException, AttaccoFallitoException, DifesaInsufficienteException, UnobtaniumEsauritoException {
        // Simula l'attacco Na'vi alla postazione RDA
        if (Math.random() < 0.7) {
            // 80% di probabilità di successo
            if (Math.random() < 0.8) {
                // 90% di probabilità di un attacco riuscito
                System.out.println(nome + " attacca con successo la postazione RDA!");
                rda.difendi(esperienza);
            } else {
                throw new ArmaMalfunzionanteException("L'arma di " + nome + " è malfunzionante!");
            }
        } else {
            throw new AttaccoFallitoException("L'attacco di " + nome + " non ha successo nel neutralizzare la postazione RDA.");
        }
    }
}
