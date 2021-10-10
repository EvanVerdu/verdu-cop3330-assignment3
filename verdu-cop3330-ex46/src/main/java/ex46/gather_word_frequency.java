package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

//Reads in the words and adds them to an array list

public class gather_word_frequency {

      public static ArrayList<String> word_frequency() {

          File file = new File("src/main/java/exercise46_input.txt");
          ArrayList<String> WordList = new ArrayList<String>();

          String input;

          try {
              Scanner scanner = new Scanner(file);
              while (scanner.hasNext()) {
                  input = scanner.next();

                  WordList.add(input);
              }

          } catch (IOException e){
              e.printStackTrace();
          }

      return WordList;

    }

}
