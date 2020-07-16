package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {

        System.out.println(replaceChar("Ala ma kota", 'a',
                                        'b'));

    }

    static String replaceChar(String str, char forReplace, char replacement) {

        char[] text = str.toCharArray();
        String replace = "";
        for (int i = 0; i < text.length; i++) {
            if (text[i] == forReplace) {
                replace = str.replace(forReplace, replacement);
            }
        }
        return replace;
    }

}
