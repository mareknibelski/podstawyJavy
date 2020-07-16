package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {

        System.out.println(firstHalf("CodersLab"));

    }

    static String firstHalf(String str){
        String half = str.substring(0, str.length() / 2);
        return half;
    }
}
