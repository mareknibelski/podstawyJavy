package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        int[][] arr = {{8, 2, 3}, {7, 9, 6}, {1, 4, 5}};
        Arrays.toString(minimum(arr));
    }

    static int[] minimum(int[][] arr) {
        int len = arr.length;
        int[] tab = new int[len];
        for (int i = 0; i < arr.length; i++) {
            int min = 65000;
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println(min);
        }
        return tab;
    }

}
