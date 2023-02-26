package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //     System.out.println("Введите количество этажей в здании и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int countFlore = scanner.nextInt();
        if (countFlore >= 1 && countFlore <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (countFlore >= 5 && countFlore <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (countFlore >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (countFlore <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}
