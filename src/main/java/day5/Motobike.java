package day5;

public class Motobike {
    private final String model;
    private final String color;
    private final String year;

    public Motobike(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }
}
