package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

// Scans the users input
// File_Creator -> creates the folders that the files will be in
// File_Editor -> Edits the file and adds the user input

public class ex43 {

      public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            // Gathers all the input from the user
            System.out.println("Site name: ");
            String name = scanner.nextLine();

            System.out.println("Author: ");
            String author = scanner.nextLine();

            System.out.println("Do you want a folder for JavaScript? ");
            String javascript = scanner.nextLine();

            System.out.println("Do you want a folder for CSS? ");
            String css = scanner.nextLine();


            //Function that creates the directory and file
            HTML_File_Creator.HTML_file(name);

            //Edits the html file and adds to the title and meta tag
            HTML_File_Editor.editor(name, author);


            String path = "src/main/java/ex43/website/" + name;

            //Checks if user wants a folder for JavaScript files and makes it if yes
            if (javascript.equals("y") || javascript.equals("Y") || javascript.equals("Yes") || javascript.equals("yes")){
                  File folder = new File(path, "js");
                  folder.mkdirs();
            }

            //Checks if user wants a folder for CSS files and makes it if yes
            if (css.equals("y") || css.equals("Y") || css.equals("Yes") || css.equals("yes")){
                  File folder2 = new File(path, "css");
                  folder2.mkdirs();
            }

      }

}
