package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Зарплата сборщика" + getSalary() + " ,бонус " + getIsPayed();
    }

    @Override
    public void doWork() {
        salary = 80 + getSalary();
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountPickedOrders() == 10000) {
            isPayed = true;
            salary = salary + 70000;
        }
    }
}

