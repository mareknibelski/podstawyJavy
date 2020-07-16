package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";

        char newStr = str.charAt(str.length() - 2);
        System.out.println(newStr);

        String newStr1 = str.substring(str.length() - 2, str.length() - 1);
        System.out.println(newStr1);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(newStr1)) {
                count += 1;
            }
        }

        System.out.println(count);

    }
}
