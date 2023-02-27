package day6;

public class Motorbike {
    private String model;
    private String color;
    private Integer year;

    public Motorbike(String model, String color, Integer year) {
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

    public Integer getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int years = Math.abs(inputYear - year);
        return years;

    }
}
