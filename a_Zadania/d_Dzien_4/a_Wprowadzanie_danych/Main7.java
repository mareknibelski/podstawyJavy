package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        nettoBrutto();

    }

    static void nettoBrutto() {

        System.out.println("Podaj typ konwersji");
        System.out.println("Dostępne typy to:");
        System.out.println("bn - zmiana brutto na netto");
        System.out.println("nb - zmiana netto na brutto");

        Scanner scan = new Scanner(System.in);

        String type = scan.next();

        while (!type.equals("bn") && !type.equals("nb")) {
            System.out.println("Podaj prawidłowy typ");
            type = scan.next();
        }

        System.out.println("Podaj kwote do przeliczenia");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Podaj liczbę do konwersji");
        }

        double num = scan.nextDouble();
        double result = 0;

        if (type.equals("bn")) {
            result = (num / 1.23);
        } else if (type.equals("nb")) {
            result = (num * 1.23);
        }

        System.out.println(result);
    }
}
