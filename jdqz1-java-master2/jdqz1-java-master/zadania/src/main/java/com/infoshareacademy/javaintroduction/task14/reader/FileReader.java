package com.infoshareacademy.javaintroduction.task14.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    public List<String> readFile(String fileName) throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        List<String> lines = Files.readAllLines(file.toPath());
        lines.forEach(line -> System.out.println(line));
        return lines;
    }
}
