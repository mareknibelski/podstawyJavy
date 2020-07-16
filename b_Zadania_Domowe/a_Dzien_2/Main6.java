package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {

        System.out.println(replaceStr("Moja mała Magdalenko " +
                "czy ty o tym wiesz", "ty", "wy"));

    }

    static String replaceStr(String str, String forReplace,
                             String replacement) {

        String replace = str.replaceAll(forReplace, replacement);
        return replace;
    }

}
