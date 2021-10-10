package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

//Asks for user input
//Creates an output file

public class ex45 {

      public static void main(String[] Args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Type the name of the new file: ");
            String name = scanner.nextLine();

            file_edit_output.edit(name);


      }
}
