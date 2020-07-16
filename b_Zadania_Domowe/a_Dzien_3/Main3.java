package b_Zadania_Domowe.a_Dzien_3;


import sun.security.util.Length;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(getLength("Moja mała Magdalenko"));
        System.out.println(getLength(null));

    }

    static int getLength(String str) {
        int len = 0;
        try {
            len = str.length();
        } catch (NullPointerException e) {
            System.out.println("String nie może być pusty");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        return len;
    }

}
