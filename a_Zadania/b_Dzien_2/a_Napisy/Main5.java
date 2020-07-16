package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {

        System.out.println(charPos("Nibelski", 'i'));

    }

    static int charPos(String str, char c) {
        int index = str.indexOf(c);
        return index;
    }
}
