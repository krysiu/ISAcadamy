package com.infoshareacademy.javaintroduction.task9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {


    private static final int LINE_ITEMS = 6;

    public void readFile() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource("plik.txt").getFile();
        File file = new File(filePath);

        List<String> lines = Files.readAllLines(file.toPath());

        for (String line : lines) {

            String[] podzielonaLinia = line.split(",");
            boolean isValid = validate(podzielonaLinia);

            if (!isValid){
                System.out.println("Blad danych");
            } else {
                System.out.println(podzielonaLinia[0]);
            }
        }
    }

    boolean validate(String[] lines){
        if (lines.length != LINE_ITEMS) {
            return false;
        }
        return true;
    }
}
