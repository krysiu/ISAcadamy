package com.infoshareacademy.javaintroduction.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    public static void main(String[] args) {

        String text = "ala ma kota i kot ma ale aLe KoTa nie widziano.";

        Pattern pattern = Pattern.compile("ma");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            System.out.println("wystapienie od: " + start + " do " + end);
        }

        pattern = Pattern.compile("ala|kot", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);

        while (matcher.find()){

            int start = matcher.start();
            int end = matcher.end();

            System.out.println("wystapienie od: " + start + " do " + end);
        }
    }
}
