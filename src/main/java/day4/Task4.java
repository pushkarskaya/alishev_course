package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arrays = new int[100];
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * (10000 - 1) + 1);
            System.out.print(arrays[i] + ", ");
        }
        for (int b = 0; b < arrays.length - 2; b++) {
            int sum = 0;
            for (int j = b; j < b + 3; j++) {
                sum = sum + arrays[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = b;
            }
        }
        System.out.println();
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}
