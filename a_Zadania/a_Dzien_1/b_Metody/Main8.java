package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {

        System.out.println(maxOfThree(5, 8, 3));

    }

    static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}
