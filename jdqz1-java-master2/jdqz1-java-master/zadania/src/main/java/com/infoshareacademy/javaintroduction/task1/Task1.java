package com.infoshareacademy.javaintroduction.task1;

public class Task1 {
    public static void main(String... args) {

        if (args.length < 1) {
            System.out.println("Wrong number of arguments!");
            return;
        }
        String arg = args[0];
        System.out.println(arg);
    }
}
