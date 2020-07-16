package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    public static void main(String[] args) {

        System.out.println(checkMaturity(17));

    }

    static boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
