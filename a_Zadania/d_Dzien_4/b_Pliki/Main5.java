package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text2.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String text = scan.nextLine();
                list.add(text);
            }
            Collections.sort(list);
            System.out.println(list);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
    }
}
