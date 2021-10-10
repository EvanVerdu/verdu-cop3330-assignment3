package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class HTML_File_CreatorTest {

    public static void HTML_file(String name){

        File file = new File("src/main/java/ex43/website/", name);
        file.mkdirs();

        String path = "src/main/java/ex43/website/" + name;

        File file2 = new File(path, "index.html");


        try {
            file2.createNewFile();

        } catch (IOException io){
            System.out.println("Could not make file.");
            System.exit(0);
        }
    }

}