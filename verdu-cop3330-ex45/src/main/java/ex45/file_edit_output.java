package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;

//Creates a new file
//Edits the file to contain the words uses instead of utilizes
//Outputs the file


public class file_edit_output {

      public static void edit(String name){

            File file = new File("src/main/java/exercise45_input.txt");

            String output_path = "src/main/java/" + name + ".txt";
            File output_file = new File(output_path);
            String output;

            //Creates the output file, edits and writes on it
            try {
                  output_file.createNewFile();
                  Scanner scanner = new Scanner(file);
                  PrintWriter out = new PrintWriter(output_path);
                  while (scanner.hasNextLine()) {
                        output = scanner.nextLine();

                        output = output.replaceAll("\\butilize\\b" ,"use");
                        output = output.replaceAll("\\butilizes\\b","uses");

                        System.out.println(output);
                        out.println(output);

                  }
                  out.close();

            } catch (IOException e){
                  e.printStackTrace();
            }

      }
}
