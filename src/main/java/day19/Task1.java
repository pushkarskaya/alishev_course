package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
                }
            }
            for (String word : wordToCount.keySet()) {
                System.out.println(word + " " + wordToCount.get(word));

            }
            if (wordToCount.containsKey("Чичиков")) {
                System.out.println("Количество раз использования слова Чичиков:");
                System.out.println("Чичиков - " + wordToCount.get("Чичиков"));
            }
            scanner.close();
            //Сортировка по значению
            List list = new LinkedList(wordToCount.entrySet());
            Collections.sort(list, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
                }
            });
            //Меняем порядок элементов в LinkedList
            Collections.reverse(list);
            HashMap newSortedMap = new LinkedHashMap();
            for (Iterator i = list.iterator(); i.hasNext(); ) {
                Map.Entry entry = (Map.Entry) i.next();
                newSortedMap.put(entry.getKey(), entry.getValue());
            }
            System.out.println("Первые 100 самых часто употребляемых слов:");
            Set set = newSortedMap.entrySet();
            Iterator iterator = set.iterator();
            int next = 0;
            while (iterator.hasNext() && (next < 100)) {
                Map.Entry map = (Map.Entry) iterator.next();
                System.out.println(map.getKey() + " " + map.getValue());
                next++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
