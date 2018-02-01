package com.infoshareacademy.javaintroduction.task8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    public void readFile() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource("plik.txt").getFile();
        File file = new File(filePath);

        List<String> lines = Files.readAllLines(file.toPath());

        for (String line : lines) {
            System.out.println(line);
        }

    }
}
