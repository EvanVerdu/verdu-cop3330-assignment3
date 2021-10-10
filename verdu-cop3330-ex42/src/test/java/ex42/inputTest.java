package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class inputTest {

    public static ArrayList<String> Input() {

        ArrayList<String> List = new ArrayList<String>();

        try {
            //reads the input file and adds the variables into the list
            ArrayList<String> list = new ArrayList<String>(Files.readAllLines(Paths.get("src/Exercise42_input.txt")));
            List = list;

            //In case it doesn't read the file it outputs that it couldn't read the file
        } catch (IOException exception) {
            System.out.println("Couldn't find the file.");
            System.exit(0);
        }

        return List;

    }

}