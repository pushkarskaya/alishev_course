package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    public int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (Player.countPlayers < 6) {
            countPlayers++;

        }
    }


    public static int getCountPlayers() {
        return Player.countPlayers;
    }

    public static void info() {
        int countPlaces = 6 - Player.countPlayers;
        if (Player.countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + countPlaces + " свободных мест");

        } else if (Player.countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == 0)
            return;
        if (stamina >= 1) {
            stamina--;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }


}

