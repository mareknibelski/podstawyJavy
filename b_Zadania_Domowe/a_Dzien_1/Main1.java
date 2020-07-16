package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {

        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
        System.out.println(dogAge(14));

    }

    static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            dogAge = dogAge * 10.5;
        } else if (dogAge > 2) {
            dogAge = (2 * 10.5) + ((dogAge - 2) * 4);
        }
        return dogAge;
    }

}
