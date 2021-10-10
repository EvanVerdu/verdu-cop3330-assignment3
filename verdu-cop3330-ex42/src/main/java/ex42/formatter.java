package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

public class formatter {

    public static ArrayList<String> format(ArrayList<String> List){

           int i;
           ArrayList<String> temp = new ArrayList<>();
           String str;
           String[] String = {"0","0","0"};

           for (i=0; i<List.size(); i++){
               str = List.get(i);
               String = str.split(",", 3);
               temp.add(String[0]);
               temp.add(String[1]);
               temp.add(String[2]);

           }



    return temp;

    }

}
