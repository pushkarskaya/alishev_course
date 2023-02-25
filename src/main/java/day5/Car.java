package day5;

public class Car {
    private String model;
    private String color;
    private Integer year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Не указана модель автомобиля");
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Не указан цвет автомобиля");
        } else {
            this.color = color;
        }
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year < 1980 || year > 2023) {
            System.out.println("Введен некорректный год выпуска автомобиля");
        }
        this.year = year;
    }
}
