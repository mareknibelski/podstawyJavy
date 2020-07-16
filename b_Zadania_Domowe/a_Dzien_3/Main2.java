package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {

        String strTab[] = {"jeden", "dwa", "trzy", "cztery"};
        System.out.println(safeGet(strTab, 1));

    }

    static String safeGet(String[] strTab, int index) {
        String result = "";
        try {
            result = strTab[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Podaj prawidłowy index tablicy");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        return result;
    }

}
