package b_Zadania_Domowe.a_Dzien_4;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(count("file.txt"));

    }

    static int count(String fileName) {
        int count = 0;
        Path path = Paths.get("b_Zadania_Domowe/a_Dzien_4/" + fileName);
        try {
            Scanner scan = new Scanner(path);
            while (scan.hasNextLine()) {
                String text = scan.nextLine();
                String white = text.trim();
                String[] parts = white.split(" ");
                count += parts.length;
            }
        } catch (IOException e) {
            System.out.println("Błąd wczytywania");
        }
        return count;
    }

}
