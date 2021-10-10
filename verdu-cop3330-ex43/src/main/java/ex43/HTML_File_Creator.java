package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;


public class HTML_File_Creator {

      public static void HTML_file(String name){

          //Creates the folders that will contain the output file

           File file = new File("src/main/java/ex43/website/", name);
           file.mkdirs();

           String path = "src/main/java/ex43/website/" + name;

           // Creates the output file

           File file2 = new File(path, "index.html");


           try {
               file2.createNewFile();

           } catch (IOException io){
               System.out.println("Could not make file.");
               System.exit(0);
           }
    }

}
