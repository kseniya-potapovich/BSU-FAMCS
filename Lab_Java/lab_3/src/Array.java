import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;


public class Array {

    public void sort_row(int[][] arr)//сортировка строчек по первому элементу
    {
        int [] t;
        for (int j = 0; j < arr.length; j++)
            for (int i = 0; i < arr.length-1-j; i++)
                if (arr[i][0]>arr[i+1][0])
                {
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]= t;
                }
    }




    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size ");
        int size = scanner.nextInt();
        System.out.println("input n ");
        int n = scanner.nextInt();
        System.out.println("input m ");
        int m = scanner.nextInt();
        Integer[][] arr = new Integer[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * n) - m);
            }
        }
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        for (Integer[] integers : arr) {
            for (Integer integer : integers) {
                System.out.print(numberFormat.format(integer) + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            int[] sum = new int[size];
            int fl = 0;
            int t;
            for (int j = 0; j < size; j++) {
                if (arr[j][i] < 0 && Math.abs(arr[j][i]) % 2 != 0) {
                    sum[i] += Math.abs(arr[j][i]);
                }
                if (arr[j][i] < 0) {
                    fl = 1;
                }
            }
            if (fl == 1) {
             //   Arrays.sort(sum, reverseOrder());
//                System.out.println(Arrays.toString(sum));

//                System.out.println(Arrays.toString(sum));
                NumberFormat numberFormat1 = NumberFormat.getPercentInstance();
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
                System.out.println(numberFormat.format(sum[i]) + "\t");
                System.out.println(numberFormat1.format(sum[i]) + "\t");
                System.out.println(numberFormat2.format(sum[i]) + "\t");
                //System.out.printf((String.valueOf(sum[i])) + "\t");


        } else
                System.out.println(0);
        }
        Arrays.sort(arr[arr.length-1], new ComparatorMas());
        System.out.println(Arrays.toString(arr[arr.length - 1]));

}
}

