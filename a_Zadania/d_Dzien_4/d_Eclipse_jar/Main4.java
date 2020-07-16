package a_Zadania.d_Dzien_4.d_Eclipse_jar;


import org.apache.commons.lang3.StringUtils;

public class Main4 {

    public static void main(String[] args) {

        String str = " Kobyła ma mały bok ";
        String reverse = StringUtils.reverse(str);

        String lowStr = str.toLowerCase();
        String lowReverse = reverse.toLowerCase();

        String whiteStr = StringUtils.deleteWhitespace(lowStr);
        String whiteReverse = StringUtils.deleteWhitespace(lowReverse);

        if (whiteStr.equals(whiteReverse)) {
            System.out.println("Wyraz to palindrom");
        } else {
            System.out.println("Wyraz nie jest palindromem");
        }

    }


}
