package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                if (numbers.length == 0) {
                    throw new Exception();
                }
                double sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum = sum + Integer.parseInt(numbers[i]);
                }
                double mean = sum / numbers.length;
                System.out.print(mean + " --> " + String.format("%.3f", mean));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

