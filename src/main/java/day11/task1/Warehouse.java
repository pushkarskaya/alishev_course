package day11.task1;

public class Warehouse {
    private  int countPickedOrders;
    private  int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public String toString() {
        return "Количество принятых заказов " + getCountPickedOrders() + ", " +
                "число доставленных заказов " + getCountDeliveredOrders();
    }
}

