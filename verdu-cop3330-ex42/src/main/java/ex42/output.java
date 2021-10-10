package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

public class output {

    public static void output(ArrayList<String> List) {

          int i;

          System.out.println("Last      First     Salary");
          System.out.println("--------------------------");

          for(i = 0; i<List.size()-1; i+=3){
              System.out.print(String.format("%-10s", List.get(i)) + String.format("%-10s", List.get(i+1)) + String.format("%-6s", List.get(i+2)) + "\n");
          }

    }

}
