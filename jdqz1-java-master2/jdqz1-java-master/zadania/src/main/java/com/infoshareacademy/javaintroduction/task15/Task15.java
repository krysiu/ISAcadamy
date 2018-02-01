package com.infoshareacademy.javaintroduction.task15;

import java.util.Set;
import java.util.TreeSet;

public class Task15 {

    public static void main(String[] args) {

        String[] stringArray = {"abc", "cba", "bca"};
        Set<String> setString = new TreeSet<>();

        // T = String
        fromArrayToCollection(stringArray, setString);

        for (String str : setString) {
            System.out.println(str);
        }

        Integer[] intArray = {3, 1, 2};
        Set<Integer> setInt = new TreeSet<>();

        // T = Integer
        fromArrayToCollection(intArray, setInt);

        for (Integer intgr : setInt) {
            System.out.println(intgr);
        }

    }


    static <T> void fromArrayToCollection(T[] array, Set<T> collection) {
        for (T object : array) {
            collection.add(object);
        }
    }
}
