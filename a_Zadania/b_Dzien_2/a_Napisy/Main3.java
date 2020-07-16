package a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {

    String str = "Tak";
    String revers = "";

    for (int i = 0; i < str.length(); i++) {
        revers += str.substring(str.length() - 1 - i, str.length() - i);
    }

        System.out.println(revers);

    }

}
