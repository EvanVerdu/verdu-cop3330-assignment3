package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

public class ex41 {

    public static void main(String[] Args){

        //gets the input from a text and places it into an array
        ArrayList<String> List = input.Input();

        //sorts the list alphabetically
        Collections.sort(List);

        //prints out the ordered list and the rest of the output
        output.output(List);

    }

}
