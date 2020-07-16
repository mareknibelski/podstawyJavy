package b_Zadania_Domowe.a_Dzien_4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        System.out.println(rewrite());

    }

    static boolean rewrite() {
        boolean result = false;
        System.out.println("Podaj nazwę pliku");
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();

        Path path = Paths.get("b_Zadania_Domowe/a_Dzien_4/" + file + ".txt");
        Path path1 = Paths.get("b_Zadania_Domowe/a_Dzien_4/" + file + "_2.txt");
        ArrayList<String> line = new ArrayList<>();
        try {
            Scanner words = new Scanner(path);
            while (words.hasNextLine()) {
                String text = words.nextLine();
                line.add(text);
                line.add(text);
            }
            try {
                if (Files.exists(path)) {
                    if (Files.exists(path1)) {
                        System.out.println("Drugi plik już istnieje");
                    }
                    Files.createFile(path1);
                    result = true;
                } else if (!Files.exists(path)) {
                    System.out.println("Plik nie istnieje");
                    result = false;
                }
                Files.write(path1, line);
            } catch (IOException e) {
                System.out.println("Błąd tworzenia plików");
            }
        } catch (IOException ex) {
            System.out.println("Błąd odczytu");
        }

        return result;
    }

}
