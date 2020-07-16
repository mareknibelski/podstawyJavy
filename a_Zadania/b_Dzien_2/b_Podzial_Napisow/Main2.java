package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) {

    String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę." +
            " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
            " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy znaleźć zatrudnienie po kursie.";

    //podział tekstu klasą String
    String[] parts = str.split("\\.");
    for (String part : parts) {
        System.out.println(part);
    }

    //podział tekstu klasą StringTokenizer
    StringTokenizer strToken = new StringTokenizer(str, "\\.");
    while (strToken.hasMoreTokens()) {
        String token = strToken.nextToken();
        System.out.println(token);
    }

    }
}
