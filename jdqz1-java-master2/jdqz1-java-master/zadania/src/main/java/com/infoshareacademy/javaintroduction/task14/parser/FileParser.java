package com.infoshareacademy.javaintroduction.task14.parser;

import com.infoshareacademy.javaintroduction.task14.pojo.Line;

import java.util.ArrayList;
import java.util.List;

public class FileParser {

    public List<Line> parseLines(List<String> fileData) {
        List<Line> lines = new ArrayList<>();
        fileData.forEach(line ->{
            String[] splitted = line.split(",");
            boolean confirmed = false;
            if ("tak".equals(splitted[5])){
                confirmed = true;
            } else if ("nie".equals(splitted[5])){
                confirmed = false;
            }

            Line linePojo = new Line();
            linePojo.setName(splitted[0]);
            linePojo.setStatus(confirmed);
            linePojo.setNumber(Integer.parseInt(splitted[4]));
            linePojo.setCity(splitted[2]);
            linePojo.setSurname(splitted[1]);

            lines.add(linePojo);
        });

        return lines;
    }
}
