package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        fillArray(0, 30, arrays);
        fillArray(300, 350, arrays);
        System.out.println(arrays);

    }

    public static void fillArray(int a, int b, ArrayList arrays1) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                arrays1.add(i);
            }
        }
    }


}
