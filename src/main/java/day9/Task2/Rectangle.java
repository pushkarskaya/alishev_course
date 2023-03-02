package day9.Task2;

public class Rectangle extends Figure {
    private double dlina;
    private double shirina;

    public Rectangle(double dlina, double shirina, String color) {
        super(color);
        this.dlina = dlina;
        this.shirina = shirina;
    }

    @Override
    public double area() {
        return dlina * shirina;
    }

    @Override
    public double perimeter() {
        return 2 * (dlina + shirina);
    }
}
