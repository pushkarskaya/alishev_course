package day11.task1;

public class Courier implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплата курьера" + salary + ", бонус " + getIsPayed();
    }


    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() == 10000) {
            isPayed = true;
            salary += 50000;
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
