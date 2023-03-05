package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        fullArray(0, 30, arrays);
        fullArray(300, 350, arrays);
        System.out.println(arrays);

    }

    public static void fullArray(int a, int b, ArrayList arrays1) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                arrays1.add(i);
            }
        }
    }


}
