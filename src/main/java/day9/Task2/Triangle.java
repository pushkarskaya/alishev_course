package day9.Task2;

public class Triangle extends Figure {
    int storona1;
    int storona2;
    int storona3;

    public Triangle(int storona1, int storona2, int storona3, String color) {
        super(color);
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public double area() {
        int p = (storona1 + storona2 + storona3) / 2;
        return Math.sqrt(p * (p - storona1) * (p - storona2) * (p - storona3));
    }

    @Override
    public double perimeter() {
        return storona1 + storona2 + storona3;
    }
}
