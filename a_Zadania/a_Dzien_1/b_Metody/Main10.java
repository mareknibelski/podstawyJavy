package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {

        System.out.println(footballWin(4,2,2,4));

    }

    static String footballWin(int AA, int BA, int AB, int BB) {
        String result = "";
        if ((AA + AB) > (BA + BB)) {
            result = "1";
        } else if ((BA + BB) > (AA + AB)) {
            result = "2";
        } else if ((AA + AB) == (BA + BB)) {
            if (AB > BA) {
                result = "1";
            } else if ((BA > AB)) {
                result = "2";
            } else {
                result = "X";
            }
        }
        return result;
    }
}
