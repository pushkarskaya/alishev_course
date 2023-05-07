package day20;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task1 {
    public static SeaPeaces[][] seaPeaces = new SeaPeaces[10][10];
    public static SeaBattle seaBattle;

    public static void main(String[] args) {

        for (int i = 0; i < seaPeaces.length; i++) {
            for (int j = 0; j < seaPeaces.length; j++) {
                seaPeaces[i][j] = SeaPeaces.EMPTY;

            }
        }
        seaBattle = new SeaBattle(seaPeaces);
        seaBattle.print(seaBattle);
        checkOneShip();
        SeaBattle.print(seaBattle);
        checkOneShip();
        SeaBattle.print(seaBattle);

    }

    public static void checkOneShip() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты первого однопалубного корабля, (формат x,y) :");
        try {
            String line = in.nextLine();
            String[] coordinats = line.split(",");
            Integer x = Integer.parseInt(coordinats[0]);
            Integer y = Integer.parseInt(coordinats[1]);

            if ((x < 0) || (y < 0) || (x > 9) || (y > 9)) {
                    throw new IndexOutOfBoundsException();
            }
            if ((seaPeaces[x][y] == SeaPeaces.OREOL) || (seaPeaces[x][y] == SeaPeaces.SHIP)) {
                throw new Exception();

            } else {
                if ((x > 0) && (y > 0)) {
                    seaPeaces[x][y] = SeaPeaces.SHIP;
                    seaPeaces[x - 1][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x - 1][y - 1] = SeaPeaces.OREOL;
                    seaPeaces[x - 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y - 1] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x][y - 1] = SeaPeaces.OREOL;
                    seaPeaces[x][y + 1] = SeaPeaces.OREOL;
                }
                if ((x == 0) && (y == 0)) {//
                    seaPeaces[x][y] = SeaPeaces.SHIP;
                    seaPeaces[x + 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x][y + 1] = SeaPeaces.OREOL;
                }
                if ((x == 0) && (y > 0)) {//
                    seaPeaces[x][y] = SeaPeaces.SHIP;
                    seaPeaces[x + 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x][y - 1] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y - 1] = SeaPeaces.OREOL;
                }

                if ((x == 0) && (y == 9)) {
                    seaPeaces[x][y] = SeaPeaces.SHIP;
                    seaPeaces[x][y - 1] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x + 1][y - 1] = SeaPeaces.OREOL;
                }
                if ((x == 9) && (y == 0)) {
                    seaPeaces[x][y] = SeaPeaces.SHIP;
                    seaPeaces[x - 1][y] = SeaPeaces.OREOL;
                    seaPeaces[x][y + 1] = SeaPeaces.OREOL;
                    seaPeaces[x - 1][y + 1] = SeaPeaces.OREOL;
                }

            }
            seaBattle = new SeaBattle(seaPeaces);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Координаты должны быть в диапазоне от 0 до 9");
        }catch (Exception e) {
            System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                    "в которой не может быть других кораблей (ореол корабля)");
        }
        ;
    }

}
