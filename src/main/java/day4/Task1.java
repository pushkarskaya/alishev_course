package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int i=scanner.nextInt();
    int [] numbers=new int[i];
//    for(i=0;i<numbers.length;i++){
//        numbers[i] = (int) (Math.random() * (10 - 1)) +1;
//        System.out.println(numbers[i]);
//    }
        int count8=0;
        int count1=0;
        int count_chet=0;
        int count_ne_chet=0;
        int sum=0;


        for (Integer number : numbers) {
            number= (int) (Math.random() * (10 - 1)) +1;
            System.out.print(number + ", ");
            if (number > 8) {
                count8++;
            }
            if (number == 1) {
                count1++;
            }
            if (number % 2 == 0) {
                count_chet++;
            } else count_ne_chet++;
            sum = sum + number;

        }
        System.out.println();
        System.out.println("Длина массива "+numbers.length);
        System.out.println("Количество чисел больше 8: "+count8);
        System.out.println("Количество чисел равных 1: "+count1);
        System.out.println("Количество четных чисел "+count_chet);
        System.out.println("Количество нечетных чисел "+count_ne_chet);
        System.out.println("Сумма всех элементов массива "+sum);
    }
}
