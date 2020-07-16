package b_Zadania_Domowe.a_Dzien_4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        try {
            System.out.println(checkFileExist());
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }


    }

    static boolean checkFileExist() throws IOException {
        System.out.println("Sprawdź czy plik już istnieje");
        Scanner scan = new Scanner(System.in);
        String nameFile = scan.nextLine();
        Path path = Paths.get("b_Zadania_Domowe/a_Dzien_4/" + nameFile);
        if (!Files.exists(path)) {
            return false;
        } else {
            return true;
        }
    }

}
