package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {

        avarage("4", "0");

    }

    static void avarage(String a, String b) {

        int first = Integer.parseInt(a);
        int sec = Integer.parseInt(b);

        try {
            int c = first / sec;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
