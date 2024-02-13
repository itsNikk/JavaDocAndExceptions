package Exceptions.Avatar;

import Exceptions.Avatar.CustomExceptions.DifesaInsufficienteException;
import Exceptions.Avatar.CustomExceptions.UnobtaniumEsauritoException;

public class RDA {
    private int posizione;
    private int difesa;
    private int miniereUnobtanium;

    public RDA(int posizione, int difesa, int miniereUnobtanium) {
        this.posizione = posizione;
        this.difesa = difesa;
        this.miniereUnobtanium = miniereUnobtanium;
    }

    public void difendi(int attacco) throws DifesaInsufficienteException, UnobtaniumEsauritoException {
        // Simula la difesa della postazione RDA
        if (difesa >= attacco) {
            System.out.println("La postazione RDA ha resistito all'attacco Na'vi!");
            difesa -= attacco;
            if (miniereUnobtanium > 0) {
                // Riduci il quantitativo di unobtanium solo se disponibile
                miniereUnobtanium--;
            } else {
                throw new UnobtaniumEsauritoException("Le miniere di unobtanium sono esaurite!");
            }
        } else {
            throw new DifesaInsufficienteException("La difesa della postazione RDA non è sufficiente!");
        }
    }
}
