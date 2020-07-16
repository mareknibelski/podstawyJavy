package a_Zadania.a_Dzien_1.c_Tablice;


public class Main1 {

    public static void main(String[] args) {

        int[] mainTab = new int[50];

        for (int i = 0; i < mainTab.length; i++){

            if (i % 10 == 0) {
                System.out.println();
            }

            if (i < 10) {
                System.out.print("0" + i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }

    }
}
