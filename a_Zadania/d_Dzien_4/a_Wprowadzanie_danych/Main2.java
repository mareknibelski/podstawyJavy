package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        operations();

    }

    static void operations() {
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        double a = 0;
        try {
            a = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowe dane");
        }


        System.out.println("Podaj drugą liczbę: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        double b = 0;
        try {
            b = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowe dane");
        }

        double sum = a + b;
        System.out.println(sum);
        double sub = a - b;
        System.out.println(sub);
        double multi = a * b;
        System.out.println(multi);
        try {
            double divis = a / b;
            System.out.println(divis);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
