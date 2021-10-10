package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class word_outputTest {

    public static void output(ArrayList<String> WordList){

        //Creates a map that can be sorted
        Set<String> unique = new HashSet<String>(WordList);
        HashMap<String, Integer> HM = new HashMap<>();

        for (String key : unique){
            HM.put(key, Collections.frequency(WordList, key));

        }

        //Sorts the map for output
        List<Integer> SortedList = new ArrayList<>(HM.values());

        Collections.sort(SortedList);
        Collections.reverse(SortedList);

        for (int value : SortedList) {
            for (String Key : HM.keySet()) {
                if (HM.get(Key).equals(value)) {
                    System.out.println(String.format("%-10s: ", Key) + value);
                }
            }
        }


    }
}