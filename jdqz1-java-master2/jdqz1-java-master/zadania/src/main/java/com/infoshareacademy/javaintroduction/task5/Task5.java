package com.infoshareacademy.javaintroduction.task5;

public class Task5 {

    public static void main(String... args){

        int n = 12;
        int f1 = 1;
        System.out.println(f1);
        int f2 = 1;
        System.out.println(f2);

        // 1,1,2,3,5,8
        while (f2 < n){
            int next = f1 + f2;

            if (next > n){
                break; // instrukcja wyjscia z petli
            }

            System.out.println(next);
            f1 = f2;
            f2 = next;

        }

    }

}
