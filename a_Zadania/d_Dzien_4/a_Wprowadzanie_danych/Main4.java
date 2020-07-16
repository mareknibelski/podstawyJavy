package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        rowsColumns();
    }

    static Scanner scan = new Scanner(System.in);

    static void rowsColumns() {

        System.out.println("Podaj liczbę wierszy:");
        noHasInt();
        int rows = scan.nextInt();

        System.out.println("Podaj liczbę kolumn:");
        noHasInt();
        int columns = scan.nextInt();

        int[][] tab = new int[rows][columns];

        int count = 1;
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = count;
                sum += count;
                count++;
            }
            System.out.println(Arrays.toString(tab[i]));
        }

        System.out.println("Suma wynosi: " + sum);

        int avg = sum / (rows * columns);
        System.out.println("Srednia wynosi: " + avg);

    }

    static void noHasInt() {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
    }
}
