package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        textLines();

    }

    static void textLines() {

        System.out.println("Wpisz tekst:");
        Scanner scan = new Scanner(System.in);
        String word = "";
        String text = scan.nextLine();
        word += text + "\n";
        while (!text.equals("quit")) {
            text = scan.nextLine();
            word += text + "\n";
        }
        System.out.println(word);

    }

}
