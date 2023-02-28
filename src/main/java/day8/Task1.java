package day8;

public class Task1 {
    public static void main(String[] args) {
        String x = new String();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            x += String.valueOf(i) + " ";
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println(x);
        long time1 = stopTime1 - startTime1;
        System.out.println("Длительность работы в мс: " + time1);
        StringBuilder builder = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int j = 0; j < 20000; j++) {
            builder.append(j).append(" ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println(builder);
        long time2 = stopTime2 - startTime2;
        System.out.println("Длительность работы в мс: " + time2);


    }
}
