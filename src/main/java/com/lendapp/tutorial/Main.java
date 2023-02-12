package com.lendapp.tutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        File file = new File("example.txt");
//        try {
//            if(file.createNewFile()){
//                System.out.println("File created: " + file.getName());
//            }else{
//                System.out.println("File already exist");
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
   }
}
