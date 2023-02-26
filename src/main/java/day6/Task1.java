package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Черный");
        car1.setModel("Volvo");
        car1.setYear(2005);
        int countYears = car1.yearDifference(1995);
        System.out.println("Разница между введенным годом и годом выпуска автомобиля " + countYears + " лет");
        Motorbike motorbike = new Motorbike("Харлей", "Хаки", 2017);
        countYears = motorbike.yearDifference(2022);
        System.out.println("Разница между введенным годом и годом выпуска мотоцикла " + countYears + " лет");
    }
}
