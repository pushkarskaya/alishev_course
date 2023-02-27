package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("S7", 2009, 389, 6000);
        Airplane air2 = new Airplane("Boeng", 2004, 567, 3400);
        Airplane.compareAirplanes(air1, air2);
    }
}