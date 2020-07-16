package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {

        System.out.println(tripple("aaawsxbbb"));

    }

    static int tripple(String str) {

        int count = 1;
        int sum = 0;
        char letter = ' ';
        char[] text = str.toCharArray();
        for (int i = 1; i < text.length; i++) {
            letter = str.charAt(i - 1);
            if (text[i] == letter) {
                count++;
                if (count == 3) {
                    sum++;
                    count = 1;
                }
            }
        }

        return sum;
    }

}
