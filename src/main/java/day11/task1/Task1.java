package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w1 = new Warehouse();
        Picker picker = new Picker(w1);
        Courier courier = new Courier(w1);
        System.out.println(w1.toString());
        Task1.businessProcess(picker);
        Task1.businessProcess(courier);
        System.out.println("Количество собранных заказов на складе w1 " + w1.getCountPickedOrders());
        System.out.println("Количество доставленных заказов w1 " + w1.getCountDeliveredOrders());
        System.out.println("ЗП сборщика склада w1 " + picker.getSalary());
        System.out.println("ЗП курьера склада w1 " + courier.getSalary());
        Warehouse w2 = new Warehouse();
        Picker picker1 = new Picker(w2);
        Courier courier1 = new Courier(w2);
        picker1.doWork();
        courier1.doWork();
        System.out.println("Проверка, что не изменилась ЗП работников склада w1");
        System.out.println("ЗП сборщика склада w1 " + picker.getSalary());
        System.out.println("ЗП курьера склада w1 " + courier.getSalary());
        System.out.println("ЗП сборщика склада w2 " + picker1.getSalary());
        System.out.println("ЗП курьера склада w2 " + courier1.getSalary());


    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
