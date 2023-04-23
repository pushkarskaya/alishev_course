package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(479877));

    }

    public static int count7(int number) {
        if (number == 0) {
            return 0;
        }
        if (number % 10 == 7) {
            return 1 + count7(number / 10);

        }
        return count7(number / 10);
    }
}
