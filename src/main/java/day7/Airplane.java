package day7;

public class Airplane {
    String manufacturer;
    int year;
    int lenght;
    int weight;
    int fuel;

    public Airplane(String manufacturer, int year, int lenght, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        int lenght1 = airplane1.lenght;
        int length2 = airplane2.lenght;
        if (lenght1 > length2) {
            System.out.println("Первый самолет длиннее");
        } else if (lenght1 < length2) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
