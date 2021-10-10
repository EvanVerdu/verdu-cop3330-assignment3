package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class HTML_File_EditorTest {

    public static void editor(String name, String author) {

        String path = "src/main/java/ex43/website/" + name + "/index.html";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("<!DOCTYPE html>\n");
            bw.write("<html lang = \"en\">\n");
            bw.write("<head>\n");
            bw.write("    <meta charset=\"UTF-8\" Author = " + author + " >\n");
            bw.write("    <title>" + name + "</title>\n");
            bw.write("</head>\n");
            bw.write("<body>\n\n");
            bw.write("</body>\n");
            bw.write("</html>");
            bw.close();

        } catch (IOException e){
            System.exit(1);
        }

    }
}