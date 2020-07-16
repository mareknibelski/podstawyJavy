package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

    public static void main(String[] args) {

        System.out.println(encode("Moja mała Magdalenko" +
                " czy ty o tym wiesz", 5));
        System.out.println(decode("Rtof%rfŇf%Rflifqjspt" +
                "%h\u007F~%y~%t%y~r%|njx\u007F", 5));
    }

    static String encode(String str, int shift) {

        char[] text = str.toCharArray();
        for (int i = 0; i != text.length; i++) {
            int num = text[i];
            num += shift;
            text[i] = (char)num;
        }

        return new String(text);
    }

    static String decode(String str, int shift) {

        char[] text = str.toCharArray();
        for (int i = 0; i != text.length; i++) {
            int num = text[i];
            num -= shift;
            text[i] = (char)num;
        }

        return new String(text);
    }

}
