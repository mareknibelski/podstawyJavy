package b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {

        System.out.println(divisibleBy(4, 2));

    }

    static boolean divisibleBy(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

}
