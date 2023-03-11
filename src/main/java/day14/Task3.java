package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String path = "people.txt";
        File file = new File(path);
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        try {
            List<Person> people = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pair = line.split(" ");
                if (Integer.parseInt(pair[1]) < 0) {
                    throw new Exception();
                }
                Person person = new Person(pair[0], Integer.parseInt(pair[1]));
                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
