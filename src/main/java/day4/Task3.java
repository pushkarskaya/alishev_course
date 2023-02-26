package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrays = new int[12][8];
        int sum = 0;
        int[] sums = new int[12];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int) (Math.random() * (50 - 1) + 1);
                System.out.print(arrays[i][j] + " ");
                sum = sum + arrays[i][j];
            }
            sums[i] = sum;
            System.out.println();
            sum = 0;
        }
        int index = 0;
        int maxsum = sums[0];
        for (int b = 0; b < sums.length; b++) {
            System.out.println(sums[b]);
            if (sums[b] > maxsum) {
                maxsum = sums[b];
                index = b;
            }
        }
        System.out.println(index);
    }
}
