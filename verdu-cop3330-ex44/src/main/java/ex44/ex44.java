package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;

//Scan User input
//Loop while the input isn't in the json file
//Reads the json file, compares the values in the file to the input
//Output name, price and quantity

public class ex44 {

      public static void main(String[] Args){

            int i = 0;
            Scanner scanner = new Scanner(System.in);

            // Loops until the user inputs a name that is within the json file
            while (i != 1){

                 // scans user input
                 System.out.println("What is the product name?");
                 String name = scanner.nextLine();

                 // Scans the json file and produces the output depending on user input
                 json_input.compare(name);

                 System.out.println("Sorry, that product was not found in our inventory.");

            }


      }
}
