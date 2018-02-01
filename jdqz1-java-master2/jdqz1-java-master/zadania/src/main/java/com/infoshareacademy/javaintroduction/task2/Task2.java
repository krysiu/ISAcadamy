package com.infoshareacademy.javaintroduction.task2;

import java.util.Random;

public class Task2 {

    public static void main(String... args) {

        int randomInt;
        Random random = new Random();
        randomInt = random.nextInt(100);
        System.out.println(randomInt);

        double randomDouble = randomInt;
        System.out.println(randomDouble);

        int rounded = (int) Math.round(randomDouble);
        System.out.println(rounded);

        if (rounded == randomDouble){
            System.out.println("rowne");
        }

    }

}