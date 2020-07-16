package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

    getInfo();

    }

    static void getInfo() {
        System.out.println("Podaj imię:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Podaj wiek:");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        int age = scan.nextInt();
        System.out.println(name + " ma " + age + " lat");
    }
}
