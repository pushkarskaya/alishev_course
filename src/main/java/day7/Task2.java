package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player2 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player3 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player4 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player5 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player6 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player7 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player.info();
        System.out.println(Player.getCountPlayers());
        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(player3.getStamina());
        System.out.println(player4.getStamina());
        System.out.println(player5.getStamina());
        System.out.println(player6.getStamina());
        while (player1.stamina > 0) {
            player1.run();
            if (player1.stamina == 0) {
                System.out.println("Игрок устал");
            }
        }
        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
    }
}
