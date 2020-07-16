package a_Zadania.d_Dzien_4.c_Pliki_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) {

        createFile("newFile");

    }

    static void createFile(String fileName) {

        Path path = Paths.get("a_Zadania/d_Dzien_4/c_Pliki_nio/" + fileName + ".txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            } else {
                System.out.println("Plik juz istnieje");
            }
        } catch (IOException e) {
            System.out.println("Nie można stworzyć pliku");
        }

    }

}
