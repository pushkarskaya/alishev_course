package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            HashMap<String, Integer> wordToCount = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (wordToCount.containsKey(word))
                    wordToCount.put(word, wordToCount.get(word) + 1);

                else {
                    wordToCount.put(word, 1);
                    ;
                }
            }
            for (String word : wordToCount.keySet()) {
                System.out.println(word + " " + wordToCount.get(word));

            }
            if (wordToCount.containsKey("Чичиков")) {
                System.out.println("Чичиков - " + wordToCount.get("Чичиков"));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
