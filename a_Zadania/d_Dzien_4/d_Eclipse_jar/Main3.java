package a_Zadania.d_Dzien_4.d_Eclipse_jar;


import org.apache.commons.lang3.StringUtils;

public class Main3 {

    public static void main(String[] args) {

        String[] str = {"Ucze", "się", "programować"};
        System.out.println(stringFormArray(str));

    }

    static String stringFormArray(String[] str) {
        String text = StringUtils.join(str, " ");
        return text;
    }

}
