package day20;

public class SeaBattle {
    SeaPeaces[][] seaPeaces = new SeaPeaces[10][10];

    public SeaBattle(SeaPeaces[][] seaPeaces) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.seaPeaces[i][j] = seaPeaces[i][j];
            }
        }

    }

    public static void print(SeaBattle seaBattle) {
        SeaPeaces[][] seaPeaces=seaBattle.seaPeaces;
        for (int i = 0; i < seaPeaces.length; i++) {
            for (int j = 0; j < seaPeaces.length; j++) {
                System.out.print(seaPeaces[i][j].toString());
            }
            System.out.println("");
        }

    }
}
