package day4;

public class Task2 {
    public static void main(String[] args) {
int[] arrays=new int[100];
int i;
for (i=0;i<arrays.length;i++){
    arrays[i]=(int)(Math.random()*(10000-1)+1);
}
int min=arrays[0];
int max=arrays[0];
int count=0;
int sum=0;
for (Integer array:arrays){
    if (array<min){min=array;}
    if (array>max){max=array;}
    if (array%10==0){count++;sum=sum+array;}

}
        System.out.println("наибольший элемент массива "+max);
        System.out.println("наименьший элемент массива "+min);
        System.out.println("количество элементов, оканчивающихся на 0 "+ count);
        System.out.println("сумма злементов, оканчивающихся на 0 "+ sum);
    }
}
