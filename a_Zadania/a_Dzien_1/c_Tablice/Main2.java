package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        int[] randNumbers = new int[20];

        int min = 100;

        for (int i = 0; i < randNumbers.length; i++) {
            Random r = new Random();
            int a = r.nextInt(101);
            System.out.println(a);

            if (min > a) {
                min = a;
                System.out.println("Min śr: " + min);
            }
        }
        System.out.println("Min: " + min);
    }
}
