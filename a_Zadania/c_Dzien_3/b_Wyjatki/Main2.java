package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(divide(4, 0));

    }

    static int divide (int a, int b){
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0 !!!");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

        return result;
    }
}
