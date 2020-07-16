package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        double sum = 0;

        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String text = scan.nextLine();
                String[] parts = text.split(",");
                for (int i = 0; i < parts.length; i++) {
                    String part = parts[i].trim();
                    System.out.println(part);
                    try {
                        double num = Double.parseDouble(part);
                        sum += num;
                    } catch (NumberFormatException ex) {
                        System.out.println("To nie jest liczba");
                    }
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
    }
}
