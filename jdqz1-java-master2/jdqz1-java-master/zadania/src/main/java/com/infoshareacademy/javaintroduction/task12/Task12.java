package com.infoshareacademy.javaintroduction.task12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Task12 {
    public static void main(String[] args) throws IOException {
        Task12 task12 = new Task12();
        List<String> lines = task12.readFile();
        task12.assignVariables(lines.get(0));

    }

    private List<String> readFile() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("plik.txt").getFile());
        List<String> lines = Files.readAllLines(file.toPath());
        return lines;
    }

    private void assignVariables(String line){
        String[] splitted = line.split(",");
        String name = splitted[0];
        String surname = splitted[1];
        String city = splitted[2];
        String street = splitted[3];
        int number = Integer.parseInt(splitted[4]);
        boolean confirmed;
        if ("tak".equals(splitted[5])){
            confirmed = true;
        } else if ("nie".equals(splitted[5])){
            confirmed = false;
        }

    }
}
