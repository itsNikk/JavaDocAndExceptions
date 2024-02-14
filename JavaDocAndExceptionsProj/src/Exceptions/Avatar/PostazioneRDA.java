package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

public class PostazioneRDA {
    private Coordinata posizione;
    private int difesa;
    private int miniereUnobtanium;

    public PostazioneRDA(Coordinata posizione, int difesa, int miniereUnobtanium) {
        this.posizione = posizione;
        this.difesa = difesa;
        this.miniereUnobtanium = miniereUnobtanium;
    }

    public void difendi(int performedAttackForce) throws DifesaInsufficienteException, UnobtaniumEsauritoException {
        // Simula la difesa della postazione RDA
        if (difesa >= performedAttackForce) {
            System.out.println("La postazione RDA ha resistito all'attacco Na'vi!");
            difesa -= performedAttackForce;
            if (miniereUnobtanium > 0) {
                System.out.println("La postazione RDA prosegue con il mining di Unobtanium");
                miniereUnobtanium--;
            } else {
                throw new UnobtaniumEsauritoException("Le miniere di unobtanium sono esaurite!");
            }
        } else {
            throw new DifesaInsufficienteException("La difesa della postazione RDA non è sufficiente!");
        }
    }

    public Coordinata getPosizione() {
        return posizione;
    }

    public void setPosizione(Coordinata posizione) {
        this.posizione = posizione;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getMiniereUnobtanium() {
        return miniereUnobtanium;
    }

    public void setMiniereUnobtanium(int miniereUnobtanium) {
        this.miniereUnobtanium = miniereUnobtanium;
    }

    @Override
    public String toString() {
        return "RDA{" +
                "posizione=" + posizione +
                ", difesa=" + difesa +
                ", miniereUnobtanium=" + miniereUnobtanium +
                '}';
    }
}
