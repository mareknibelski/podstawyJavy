package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) {

    String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

    //podział za pomocą klasy String
    String[] parts = str.split(" ");
    for (String part : parts) {
        System.out.println(part);
    }

    //podział za pomocą klasy StringTokenizer
    StringTokenizer strToken = new StringTokenizer(str);
    while (strToken.hasMoreTokens()) {
        String token = strToken.nextToken();
        System.out.println(token);
    }

    }
}
