package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {

        System.out.println(encode("Moja mała Magdalenko " +
                "czy tu o tym wiesz"));

    }

    static String encode(String str) {

        char[] text = str.toCharArray();
        for (int i = 0; i != text.length; i++) {
            int num = text[i];
            num += 3;
            text[i] = (char)num;
        }

        return new String(text);
    }

}
