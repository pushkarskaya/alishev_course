package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("S7", 2015, 380, 9000);
        airplane.info();
        airplane.setYear(2021);
        airplane.setLenght(360);
        airplane.info();
        airplane.fillUp(100);
        airplane.fillUp(14);
        airplane.info();
    }
}
