package b_Zadania_Domowe.a_Dzien_3;


public class Main5 {

    public static void main(String[] args) {

        try {
            int[] elements = {2,7,9,4,6};
            System.out.println(elementExists(elements, 1));
        } catch (Exception e) {
            System.out.println("Nie ma takiego elementu!");
        }

    }

    static int elementExists(int[] elements, int value) {

        String result = "";

            for (int i = 0; i < elements.length; i++) {

                if (elements[i] == value) {
                    int res = elements[i];
                    result = String.valueOf(res);
                }

            }

        return Integer.parseInt(result);
    }

}
