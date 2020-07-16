package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3},{4, 5, 6}};
        System.out.println((evenSum(arr)));

    }

    static int evenSum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j = j + 2) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
