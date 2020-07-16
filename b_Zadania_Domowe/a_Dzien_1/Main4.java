package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {

        int[][] arr = {{8, 2, 3}, {7, 9, 6}, {1, 4, 5}};
        System.out.println(Arrays.toString(lessMore(arr)));

    }

    static int[] lessMore(int[][] arr) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }

        System.out.println(sum);
        System.out.println(count);
        int avg = sum / count;
        System.out.println("śr = " + avg);

        int countMin = 0;
        int countMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    countMax++;
                } else {
                    countMin++;
                }
            }
        }

        System.out.println(countMin);
        System.out.println(countMax);

        int[] tab = {countMin, countMax};
        return tab;
    }

}
