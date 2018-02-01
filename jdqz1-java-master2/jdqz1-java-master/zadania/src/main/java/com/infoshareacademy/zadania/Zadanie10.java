package com.infoshareacademy.zadania;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
tekst: ala ma kota i kot ma ale aLe KoTa nie widziano.

do znalezienie: "ma"
 */
public class Zadanie10 {

    public static void main(String[] args) {

        String text = "ala ma kota i kot ma ale aLe KoTa nie widziano";
        Pattern p = Pattern.compile("ma", Pattern.CASE_INSENSITIVE);

        Matcher matcher = p.matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("start " + start );
            System.out.println("end " + end );

        }

    }
}
