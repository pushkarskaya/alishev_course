package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Jeep Wrangler");
        car.setColor("Красный");
        car.setYear(2022);
        System.out.println("Марка автомобиля: " + car.getModel());
        System.out.println("Цвет автомобиля: " + car.getColor());
        System.out.println("Год выпуска автомобиля: " + car.getYear());
    }
}
