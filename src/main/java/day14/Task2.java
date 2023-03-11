package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String path = "people.txt";
        File file = new File(path);

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String people = scanner.nextLine();
                String[] words = people.split(" ");
                if (Integer.parseInt(words[1]) < 0) {
                    throw new Exception();
                }
                peoples.add(people);
            }
            return peoples;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}