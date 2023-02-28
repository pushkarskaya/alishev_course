package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int lenght, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + String.valueOf(year) + ", длина: " + String.valueOf(lenght) + ", вес: " + String.valueOf(weight) + ", количество топлива в баке: " + String.valueOf(fuel);

    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel = this.fuel + n;
    }
}
