package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/Main1.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String text = scan.nextLine();
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }


    }
}
