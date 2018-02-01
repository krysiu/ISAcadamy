package com.infoshareacademy.javaintroduction.task14;


import com.infoshareacademy.javaintroduction.task14.parser.FileParser;
import com.infoshareacademy.javaintroduction.task14.pojo.Line;
import com.infoshareacademy.javaintroduction.task14.reader.FileReader;

import java.io.IOException;
import java.util.List;

public class Task14 {

    public List<Line> parse(String fileName) throws IOException {

        // read file
        FileReader fileReader = new FileReader();
        List<String> fileData = fileReader.readFile(fileName);

        // parse file
        FileParser fileParser = new FileParser();
        List<Line> parsedData = fileParser.parseLines(fileData);

        return parsedData;

    }

}
