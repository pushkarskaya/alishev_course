package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<String>();
        arrays.add("Москвич");
        arrays.add("Волга");
        arrays.add("Чайка");
        arrays.add("УАЗ");
        arrays.add("Жигули");


        System.out.println(arrays);
        arrays.add(2, "Нива");
        arrays.remove(0);
        System.out.println(arrays);
    }
}
