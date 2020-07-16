package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {

        System.out.println(toInt("42dfe"));

    }

    static int toInt(String str) {
        int res = 0;
        try {
            res = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("str musi składać sie tylko z liczb");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        return res;
    }

}
