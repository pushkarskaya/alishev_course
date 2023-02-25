package day4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
int[] arrays=new int[100];
int sum=0;
for(int i=0;i<arrays.length;i++){
    arrays[i]=(int)(Math.random()*(10000-1)+1);

    System.out.print(arrays[i]+", ");

}
        ArrayList<Integer> A=new ArrayList<Integer>();
        int bbb=0;
for (int i=0;i<arrays.length-2;i++){
    sum=0;
    sum=arrays[i]+arrays[i+1]+arrays[i+2];
    A.add(sum);
}
        System.out.println();
    System.out.print(A);


    }
}
