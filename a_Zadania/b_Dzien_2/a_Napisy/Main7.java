package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {

        System.out.println(containsStr("CodersLab", "Lab"));

    }

    static boolean containsStr(String str, String search){
        if (str.contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
