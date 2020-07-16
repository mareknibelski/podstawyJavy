package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) {

        String str = " To jest tekst do ";
        System.out.println(countTokens(str));
        System.out.println(countTokens2(str));

    }

    //podział klasą String
    static int countTokens(String str) {
        int count = 0;
        String newStr  = str.trim();
        String[] parts = newStr.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
            count++;
        }
        return count;
    }

    //podział klasą StringTokenizer
    static int countTokens2(String str) {
        int count = 0;
        StringTokenizer strToken = new StringTokenizer(str);
        while (strToken.hasMoreTokens()) {
            String token = strToken.nextToken();
            System.out.println(token);
            count++;
        }
        return count;
    }

}