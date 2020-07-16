package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {

        System.out.println(checkEvenOdd(35));

    }

    static String checkEvenOdd (int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
