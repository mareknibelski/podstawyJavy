package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Wpisz tekst");
        Scanner scan = new Scanner(System.in);
        try {
            PrintWriter out = new PrintWriter("a_Zadania/d_Dzien_4/b_Pliki/Main1.txt");
            String text = scan.nextLine();
            while (!text.equals("quit")) {
                out.println(text);
                System.out.println("Wpisz kolejną linie tekstu");
                text = scan.nextLine();
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd zapisu do pliku");
        }
    }
}
