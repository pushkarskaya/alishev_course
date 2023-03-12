package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/file1.txt");
        fillFile1(file);
        File fileNew = new File("src/main/resources/file2.txt");
        fillFile2(file, fileNew);
        printResult(fileNew);
    }

    public static void fillFile1(File file) {
        file.getParentFile().mkdirs();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < 1000; i++) {
                printWriter.print((int) (Math.random() * 100) + " ");
            }
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        }
    }

    public static void fillFile2(File file1, File file2) {
        file2.getParentFile().mkdirs();
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String[] lines = scanner.nextLine().split(" ");
                double sum = 0;
                int j = 0;
                PrintWriter printWriter1 = new PrintWriter(file2);
                for (j = 0; j < lines.length; j++) {
                    int b = j;
                    for (int i = j; i < b + 20; i++) {
                        sum = sum + Integer.parseInt(lines[i]);
                    }
                    double mean = sum / 20;
                    printWriter1.print(mean + " ");
                    sum = 0;
                    j = j + 19;
                }
                printWriter1.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        double allmean = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                for (String number : numbers
                ) {
                    allmean = allmean + Double.parseDouble(number);
                }
            }
            System.out.println((int) allmean);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}





