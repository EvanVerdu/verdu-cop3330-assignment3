package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

public class ex42 {

    public static void main(String[] Args){

        // Gets the Input and puts it into a list with the separating commas
        ArrayList<String> List = input.Input();

        // Removes the commas from the list and separates the different values
        List = formatter.format(List);

        // Outputs the values from the list
        output.output(List);

    }

}
