package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] secondNumners = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] sum = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            sum[i] = numbers[i] + secondNumners[i];
        }

        System.out.println(Arrays.toString(sum));

    }
}
