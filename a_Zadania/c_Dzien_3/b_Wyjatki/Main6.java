package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Obiekt typu string nie może być null");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

    }


}
