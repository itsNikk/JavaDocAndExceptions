package Exceptions.Avatar;

import java.util.Random;

public class Main {

    public static final int RAID_NUM = 100;

    public static void main(String[] args) throws InterruptedException {
        Avatar[] avatars = {
                new Avatar("Neytiri", "Arco", 90),
                new Avatar("Jake", "Coltello", 80),
                // Aggiungere altri Avatar a piacere
        };

        Random r = new Random();
        RDA rda = new RDA(new Coordinata(), r.nextInt(100, 130), 2);
        for (int i = 0; i < RAID_NUM; i++) {
            RaidNaVi raid = new RaidNaVi(avatars, rda);

            System.out.println("----- RAID NUMERO " + (i + 1) + " -----");
            System.out.println(rda);
            System.out.println(avatars[0]);
            System.out.println(avatars[1]);
            raid.eseguiRaid();
            Thread.sleep(5000);
        }
    }
}