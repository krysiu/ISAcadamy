package com.infoshareacademy.javaintroduction.task11;

import com.infoshareacademy.zadanie_domowe.Uczen;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

    public int pole2;

    private int pole;



    public static void main(String[] args) throws IOException {



        String date = "20/12/2014";
        String patternString = "([0-9]{2})/([0-9]{2})/([0-9]{4})";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);

            System.out.println(day + "-" + month + "-" + year);
        }

    }



    private int pole3;

    private void metoda (){

    }
}
