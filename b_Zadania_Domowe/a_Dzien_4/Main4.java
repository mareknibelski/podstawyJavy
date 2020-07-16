package b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray()));

    }

    static int[] sortedArray() {
        System.out.println("Podaj ile liczb chcesz wylosować");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        int num = scan.nextInt();

        int[] tab = new int[num];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(101);
        }

        Arrays.sort(tab);

        return tab;
    }

}
