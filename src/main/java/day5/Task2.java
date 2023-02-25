package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike bike = new Motobike("BMV", "Черный", "2023");
        System.out.println("Марка мотоцикла: " + bike.getModel());
        System.out.println("Цвет мотоцикла: " + bike.getColor());
        System.out.println("Год выпуска мотоцикла: " + bike.getYear());
    }
}
