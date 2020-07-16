package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {

        System.out.println(stringFromArray(new String[]{"Marek", "MaRcZaN", "Nibelski"}));

    }

    static String stringFromArray(String[] str){
        String strJoin = String.join(" ", str);
        return strJoin;
    }
}
