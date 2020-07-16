package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(append(arr)));

    }

    static int[] append(int[] arr) {
        int[] copyTab = Arrays.copyOf(arr, arr.length * 2);

        for (int i = 0; i < arr.length; i++) {
            copyTab[copyTab.length - 1 - i] = arr[i];
        }

        return copyTab;
    }

}
