package a_Zadania.d_Dzien_4.c_Pliki_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        readFromFile("fileName");

    }

    static void readFromFile(String fileName) {

        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pliki_nio/" + fileName + ".txt");
        Path path1 = Paths.get("a_Zadania/d_Dzien_4/c_Pliki_nio/" + fileName + ".html");
        ArrayList<String> line = new ArrayList<>();
        try {
            Scanner scan = new Scanner(path);
            line.add("<html>");
            line.add("<title>Moja strona</title>");
            line.add("<body>");
            while (scan.hasNextLine()){
                String text = scan.nextLine();
                line.add("<p>" + text + "</p>");
            }
            line.add("</body>");
            line.add("<html>");
            try {
                if (!Files.exists(path1)) {
                    Files.createFile(path1);
                }
                Files.write(path1, line);
            } catch (IOException e) {
                System.out.println("Błąd zapisu do pliku");
            }
        } catch (IOException e) {
            System.out.println("Brak pliku");
        }

    }

}
