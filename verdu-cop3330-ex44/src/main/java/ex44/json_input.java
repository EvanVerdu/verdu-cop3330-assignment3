package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class json_input {

      public static void compare(String input){

          JSONParser parser = new JSONParser();

          try {
              // Reads in the JSON file
              Object obj = parser.parse(new FileReader("src/main/java/exercise44_input.json"));
              JSONObject jso = (JSONObject) obj;

              //Separates the JSON file into different objects
              JSONArray products = (JSONArray)jso.get("products");

              for(int i = 0; i<3; i++) {

                  Object objects = products.get(i);
                  String Objects = objects.toString();
                  JSONObject jsobj = (JSONObject) objects;

                  String name = (String) jsobj.get("name");
                  Double price = (Double) jsobj.get("price");
                  Long quantity = (Long) jsobj.get("quantity");

                  // Output after comparing name values with user input
                  if (Objects.contains(input)){
                      System.out.println("Name: " + name);
                      System.out.println("Price: " + String.format("%.2f",price));
                      System.out.println("Quantity: " + quantity);
                      System.exit(1);
                  }

              }
              //catches an exception
          } catch (Exception e){
              e.printStackTrace();
          }


      }
}
