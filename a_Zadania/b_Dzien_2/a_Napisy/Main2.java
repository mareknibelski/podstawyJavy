package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {

        String str = "  Kobyła ma mały bok   ";
        System.out.println(str);
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.substring(i, i + 1);
        }

        System.out.println(reverse);

        String smallStr = str.toLowerCase();
        System.out.println(smallStr);
        String smallReverse = reverse.toLowerCase();
        System.out.println(smallReverse);

        String repStr = smallStr.replaceAll(" ", "");
        System.out.println(repStr);
        String repRev = smallReverse.replaceAll(" ", "");
        System.out.println(repRev);

        if (repStr.equals(repRev)) {
            System.out.println("To jest palindrom");;
        } else {
            System.out.println("To nie jest palindrom");
        }

    }

}
