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
            } catch (ArmaMalfunzionanteException | AttaccoFallitoException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (UnobtaniumEsauritoException unobtaniumEsauritoException) {
                System.out.println("Errore: " + unobtaniumEsauritoException.getMessage());
                System.out.println("La postazione RDA cambia posizione per continuare la ricerca di unobtanium");
                rda.setPosizione(rda.getPosizione().Add(1));
            } catch (DifesaInsufficienteException e) {
                System.out.println("Errore: " + e.getMessage());
                rda.setPosizione(rda.getPosizione().Add(3));
                rda.setDifesa(100);
            }
        }
    }
}
