package com.infoshareacademy.javaintroduction.task3;

import java.util.Random;

public class Task3 {

    public static void main(String... args) throws InterruptedException {

        while (true){
            checkPrecision();
            Thread.sleep(1000);
        }

    }

    private static void checkPrecision(){
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
