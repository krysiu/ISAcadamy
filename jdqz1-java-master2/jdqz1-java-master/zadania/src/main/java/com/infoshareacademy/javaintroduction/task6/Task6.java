package com.infoshareacademy.javaintroduction.task6;

public class Task6 {

    public static void main(String... args) {

        String[] imiona = {"imie1", "imie2", "a", "dlugieimie"};

        String najdluzsze = "";
        String najkrotsze = "";

        for (String imie : imiona){
            if (imie.length() > najdluzsze.length()){
                najdluzsze = imie;
            }

            if (najkrotsze.length() == 0){
                najkrotsze = imie;
            } else {
                if (imie.length() < najkrotsze.length()){
                    najkrotsze = imie;
                }
            }

        }


        System.out.println(najdluzsze);
        System.out.println(najkrotsze);
    }
}
