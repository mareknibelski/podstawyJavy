package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {

        System.out.println(calculateNetto(40, 0.23));
    }

    static double calculateNetto(double gross, double vat) {
        return gross - (gross * vat); // w nawiasie obliczam vat potem
    }                                 // brutto odejmuje od vat
}
