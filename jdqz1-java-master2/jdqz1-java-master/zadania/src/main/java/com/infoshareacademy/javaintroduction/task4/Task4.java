package com.infoshareacademy.javaintroduction.task4;

public class Task4 {

    public static void main(String... args){

        int n = 50;

        for (int i = 6; i <= n; i++){
            // dla kazdego i szukamy dzielnikow
            // i = 10
            // 1,2,3,4,5
            // 1, 2, 5
            // i = 15
            // 1,2,3,4,5,6,7
            // 1,2,3,5,
            int sumaDzielnikow = 0;

            for (int j = 1; j <= i/2; j++){
                int wynikModulo = i % j;
                if (wynikModulo == 0){
                    sumaDzielnikow = sumaDzielnikow + j;
                    //sumaDzielnikow +=j;
                }
            }

            if (i==sumaDzielnikow){
                System.out.println(i);
            }

        }

    }

}
