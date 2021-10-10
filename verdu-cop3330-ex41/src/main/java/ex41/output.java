package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;


public class output {

      public static void output(ArrayList<String> List){

            int size = List.size(); // gets the number of names in the list

            // prints the output
            System.out.println("Total of " + size + " names\n----------------");

            for (String value: List){
                  System.out.println(value);
            }

            return;

      }
}
