package a_Zadania.b_Dzien_2.a_Napisy;

public class Main4 {

    public static void main(String[] args) {

        System.out.println(toggleChar("TaK"));

    }

    static String toggleChar(String str) {
        String toggle = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)) {
                toggle += Character.toLowerCase(letter);
            } else if (Character.isLowerCase(letter)) {
                toggle += Character.toUpperCase(letter);
            }
        }

        return toggle;
    }
}
