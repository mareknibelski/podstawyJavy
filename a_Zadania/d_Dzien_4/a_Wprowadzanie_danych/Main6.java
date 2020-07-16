package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        equation();

    }

    static void equation() {

        System.out.println("Podaj liczbę a:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie liczba");
        }
        int a = scan.nextInt();
        System.out.println("Podaj liczbę b:");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie liczba");
        }
        int b = scan.nextInt();
        System.out.println("Podaj liczbę c:");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie liczba");
        }
        int c = scan.nextInt();

        double delta1 = 4 * a * c;
        double delta2 = b * b;
        double delta = delta2 - delta1;
        System.out.println("Delta = " + delta);

        double sqrt = Math.sqrt(delta);
        System.out.println("Pierwiastek z delty = " + sqrt);

        if (delta > 0) {
            double x1 = (-b - sqrt) / (2 * a);
            double x2 = (-b + sqrt) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Delta jest mniejsza od 0, więc nie ma " +
                    "pierwiasktów");
        }

    }
}
