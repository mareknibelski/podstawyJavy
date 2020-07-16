package b_Zadania_Domowe.a_Dzien_4;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        printTriangle();

    }

    static void printTriangle() {
        System.out.println("Podaj wartość");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba");
        }
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }

}
