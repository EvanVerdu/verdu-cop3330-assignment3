package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

public class input {

    public static ArrayList<String> Input(){

        ArrayList<String> List = new ArrayList<String>();

       try {
           //reads the input file and adds the names into the list
           File file = new File("src/Exercise41_input.txt");
           Scanner scanner = new Scanner(file);
           while (scanner.hasNextLine()){
               List.add(scanner.nextLine());
           }

           //In case it doesn't read the file it outputs that it couldn't read the file
       } catch (FileNotFoundException exception) {
           System.out.println("Couldn't find the file.");
           System.exit(0);
       }


    return List;

    }
}
