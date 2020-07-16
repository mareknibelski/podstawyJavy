package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {

        int[] numbers = {5, 8, 9, 2, 1, 6, 3, 0, 7, 4};
        int[] reverse = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}
