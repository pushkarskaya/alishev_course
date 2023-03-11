package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "test.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String str1 = scanner.nextLine();
            String[] arrays = str1.split(" ");
            if (arrays.length != 10) {
                throw new IllegalArgumentException();
            }
            int sum = 0;
            for (String number : arrays
            ) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return;
        }
    }
}
