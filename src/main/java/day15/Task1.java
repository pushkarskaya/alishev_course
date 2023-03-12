package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        File fileNew = new File("src/main/resources/missing_shoes.txt");
        fileNew.getParentFile().mkdirs();
        try {
            PrintWriter printWriter = new PrintWriter(fileNew);
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] elements = line.split(";");
                    if (elements.length != 3) {
                        throw new Exception();
                    }
                    if (Integer.parseInt(elements[2]) == 0) {
                        printWriter.println(elements[0] + ", " + elements[1] + ", " + elements[2]);
                    }
                }
                printWriter.close();
                Scanner scannerNew = new Scanner(fileNew);
                while (scannerNew.hasNextLine()) {
                    System.out.println(scannerNew.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            } catch (Exception e) {
                System.out.println("Некорректный входной файл");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}
