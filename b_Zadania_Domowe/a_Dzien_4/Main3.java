package b_Zadania_Domowe.a_Dzien_4;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(retirement()));

    }

    static String[] retirement() {
        int count = 0;
        String[] retire = new String[2];
        String result = "";
        System.out.println("Podaj nazwe pliku");
        Scanner text = new Scanner(System.in);
        String file = text.next();
        Path path = Paths.get("b_Zadania_Domowe/a_Dzien_4/" + file);
        try {
            Scanner scan = new Scanner(path);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(" ");
                int yearBirth = Integer.parseInt(parts[2]);
                int year = LocalDateTime.now().getYear();
                if ((year - yearBirth >= 60) && (parts[3].equals("K"))) {
                    result = parts[1] + " " + parts[0];
                    retire[count] = result;
                } else if ((year - yearBirth >= 65) && (parts[3].equals("M"))) {
                    result = parts[1] + " " + parts[0];
                    retire[count] = result;
                }
                count++;
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }
        return retire;
    }
}
