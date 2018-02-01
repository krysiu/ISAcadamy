package com.infoshareacademy.javaintroduction.task13;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Task13 {

    public static void main(String[] args) throws IOException {
        Task13 task13 = new Task13();
        List<String> lines = task13.readFile();
        task13.assignVariables(lines.get(0));
    }

    private List<String> readFile() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("plik.txt").getFile());
        List<String> lines = Files.readAllLines(file.toPath());
        return lines;
    }

    private Line assignVariables(String lineString){
        String[] splitted = lineString.split(",");
        boolean confirmed = false;
        if ("tak".equals(splitted[5])){
            confirmed = true;
        } else if ("nie".equals(splitted[5])){
            confirmed = false;
        }

        Line line = new Line();
        line.setName(splitted[0]);
        line.setStatus(confirmed);
        line.setNumber(Integer.parseInt(splitted[4]));
        line.setCity(splitted[2]);
        line.setSurname(splitted[1]);

        return line;
        
    }
}
