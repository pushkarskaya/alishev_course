package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        HashMap<Integer, Point> taxiMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] num = line.split(" ");
                Point point = new Point(Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                taxiMap.put(Integer.parseInt(num[0]), point);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату x первой точки квадрата");
        int x1 = in.nextInt();
        System.out.println("Введите координату y первой точки квадрата");
        int y1 = in.nextInt();
        System.out.println("Введите координату x второй точки квадрата");
        int x2 = in.nextInt();
        System.out.println("Введите координату y второй точки квадрата");
        int y2 = in.nextInt();
        if ((x2 - x1 == y2 - y1) && (x2 > x1) && (y2 > y1) && (x1 <= 99) && (x1 >= 0) && (x2 <= 99) && (x2 >= 0) && (y1 >= 0) && (y1 <= 99) && (y2 >= 0) && (y2 <= 99)) {
            System.out.println("Построен квадрат со сторонами x=" + String.valueOf(x2 - x1) + ", y=" + String.valueOf(y2 - y1));
            AtomicInteger count = new AtomicInteger();
            System.out.println("Идентификаторы машин, которые попали в квадрат:");
            taxiMap.entrySet().forEach(entry -> {
                if ((x1 < entry.getValue().getX()) && (entry.getValue().getX() < x2)
                        && (y1 < entry.getValue().getY()) && (entry.getValue().getY() < y2)) {
                    System.out.println(entry.getKey());
                    count.incrementAndGet();
                }
            });
            System.out.println("Кол машин " + String.valueOf(count));
        } else
            System.out.println("По введенным координатам не удалось построить квадрат");
    }
}


