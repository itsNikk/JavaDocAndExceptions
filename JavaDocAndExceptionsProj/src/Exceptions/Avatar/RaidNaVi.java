package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.ArmaMalfunzionanteException;
import Exceptions.Avatar.CustomExceptions.AttaccoFallitoException;
import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

public class RaidNaVi {
    private Avatar[] avatars;
    private RDA rda;

    public RaidNaVi(Avatar[] avatars, RDA rda) {
        this.avatars = avatars;
        this.rda = rda;
    }

    public void eseguiRaid() {
        for (Avatar avatar : avatars) {
            try {
                avatar.attacca(rda);
            } catch (ArmaMalfunzionanteException | AttaccoFallitoException | DifesaInsufficienteException |
                     UnobtaniumEsauritoException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}
