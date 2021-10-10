package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.*;
import java.io.*;

//gather the input list into an array
//picks the words and adds them together if they are similar
//outputs the information of the words


public class ex46 {

    public static void main(String[] Args){

        ArrayList<String> WordList = new ArrayList<String>();

        WordList = gather_word_frequency.word_frequency();
        word_output.output(WordList);

    }
}
