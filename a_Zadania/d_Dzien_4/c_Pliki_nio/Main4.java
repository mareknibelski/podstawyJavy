package a_Zadania.d_Dzien_4.c_Pliki_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        writeToFile("fileName");

    }

    static void writeToFile(String fileName) {

        Scanner scan = new Scanner(System.in);
        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pliki_nio/" + fileName + ".txt");
        ArrayList<String> list = new ArrayList<>();
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            System.out.println("Zapisz linię testu do pliku");
            String text = scan.nextLine();
            list.add(text);

            while (!text.equals("quit")) {
                System.out.println("Zapisz kolejną linię tekstu do pliku");
                text = scan.nextLine();
                if (!text.equals("quit")) {
                    list.add(text);
                }
            }

            try {
                Files.write(path, list);
            } catch (IOException e) {
                System.out.println("Nie można zapisać pliku");
            }
        } catch (IOException e) {
            System.out.println("Błąd zapisu");
        }

    }
}
