package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {

        System.out.println(createName("Marek",
                                        "Nibelski",
                                        "MaRcZaN"));

    }

    static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }
}
