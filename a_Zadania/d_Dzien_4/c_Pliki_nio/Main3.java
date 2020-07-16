package a_Zadania.d_Dzien_4.c_Pliki_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) {

        copyFile("a_Zadania/d_Dzien_4/c_Pliki_nio/newDirectory/"
                            , "fileName.txt"
                            , "copyFileName.txt");

    }

    static void copyFile(String directory, String fileName,
                         String secondFileName) {

        Path path = Paths.get(directory , fileName);
        Path path1 = Paths.get(directory, secondFileName);
        try {
            if (Files.exists(path)) {
                Files.copy(path, path1);
            } else {
                System.out.println("Plik o nazwie " + fileName +
                        ", dlatego kopiowanie nie jest możliwe");
            }
        } catch (IOException e) {
            System.out.println("Błąd kopiowania");
        }


    }

}
