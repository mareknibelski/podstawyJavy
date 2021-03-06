package a_Zadania.d_Dzien_4.c_Pliki_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) {

        createDirectory("newDirectory");

    }

    static void createDirectory(String fileName) {

        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pliki_nio/" + fileName);
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
            } else {
                System.out.println("Katalog już istnieje!!!");
            }
        } catch (IOException e) {
            System.out.println("Nie można stworzyć katalogu");
        }

    }

}
