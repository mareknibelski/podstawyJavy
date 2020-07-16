package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        getData();

    }

    static void getData() {

        int sum = 0;
        int count = 0;
        System.out.println("Podaj liczbę:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        int number = scan.nextInt();
        while (number != 0) {
            System.out.println("Podaj kolejną liczbę");
            sum += number;
            count++;
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("To nie jest liczba");
            }
            number = scan.nextInt();
        }
        System.out.println("Suma wynosi: " + sum);
        System.out.println("Ilość zsumowanych liczb to: " + count);

    }
}
