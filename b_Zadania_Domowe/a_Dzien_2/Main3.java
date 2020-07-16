package b_Zadania_Domowe.a_Dzien_2;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(upperCase("Moja mała Magdalenko" +
                " czy ty o tym wiesz", 2));

    }

    static String upperCase(String str, int index) {

        String result = "";
        char[] text = str.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (i % index == 0) {
                char letter = Character.toUpperCase(text[i]);
                result += letter;
            } else {
                result += text[i];
            }
        }

        return result;
    }

}
