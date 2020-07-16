package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4 {

    public static void main(String[] args) {

        String str = "Java+zdania+podzial+napisow+cfsdf+d324f";
        System.out.println(Arrays.toString(onlyTwoElements(str, '+')));
        System.out.println(Arrays.toString(onlyTwoElements2(str, '+')));
    }

    //podział klasą String
    static String[] onlyTwoElements(String str, char separator) {
        String sep = String.valueOf(separator);
        String[] parts;
        if (sep.equals(".") || sep.equals("+")) {
            parts = str.split("\\.|\\+");
        } else {
            parts = str.split(sep);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
            if (i == parts.length - 1) {
                sb.append(parts[i]);
            } else{
                sb.append(parts[i] + sep);
            }
        }
        String[] result = {parts[0], sb.toString()};
        return result;
    }

    //podział klasą StringTokenizer
    static String[] onlyTwoElements2(String str, char separator) {
        String sep = String.valueOf(separator);
        StringTokenizer strToken = new StringTokenizer(str, sep);
        String first = "";

        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                len++;
            }
        }
        String[] second = new String[len + 1];
        int i = 0;

        while (strToken.hasMoreTokens()) {
            String token = strToken.nextToken();

            if (i == 0) {
                first = token;
            }

            if (i > 0) {
                second[i] = token;
            }

            i++;

        }

        String newStr = String.join(sep, second);
        String newS = newStr.substring(str.indexOf(sep) + 1, str.length());

        String[] result = {first, newS};
        return result;
    }

}