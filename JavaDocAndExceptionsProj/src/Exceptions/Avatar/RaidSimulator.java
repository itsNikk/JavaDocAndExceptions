package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.ArmaMalfunzionanteException;
import Exceptions.Avatar.CustomExceptions.AttaccoFallitoException;
import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

import java.util.Random;

public class RaidSimulator {
    private Avatar[] avatars;
    private PostazioneRDA postazioneRda;

    private final Random gen = new Random();

    public RaidSimulator(Avatar[] avatars, PostazioneRDA postazioneRda) {
        this.avatars = avatars;
        this.postazioneRda = postazioneRda;
    }

    public void performRaid() {
        for (Avatar avatar : avatars) {
            try {
                avatar.attacca(postazioneRda);
            } catch (ArmaMalfunzionanteException | AttaccoFallitoException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (UnobtaniumEsauritoException unobtaniumEsauritoException) {
                System.out.println("Errore: " + unobtaniumEsauritoException.getMessage());
                System.out.println("La postazione RDA cambia posizione per continuare la ricerca di unobtanium");
                postazioneRda.setPosizione(postazioneRda.getPosizione().Add(1));
                postazioneRda.setMiniereUnobtanium(gen.nextInt(1, 11));
            } catch (DifesaInsufficienteException e) {
                System.out.println("Errore: " + e.getMessage());
                postazioneRda.setPosizione(postazioneRda.getPosizione().Add(3));
                postazioneRda.setDifesa(100);
            }
        }
    }
}
