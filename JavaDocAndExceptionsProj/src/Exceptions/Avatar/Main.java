package Exceptions.Avatar;

public class Main {
    public static void main(String[] args) {
        Avatar[] avatars = {
                new Avatar("Neytiri", "Arco", 90),
                new Avatar("Jake", "Coltello", 80),
                // Aggiungere altri Avatar se necessario
        };

        RDA rda = new RDA(1, 100, 5);
        RaidNaVi raid = new RaidNaVi(avatars, rda);

        raid.eseguiRaid();
    }
}
