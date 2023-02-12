package com.lendapp.tomiwa;

import javax.swing.*;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter score: ");
//        int score = scanner.nextInt(); // it is suppose to be in double
//        double score = scanner.nextDouble();
        //char grade ;
        String result = JOptionPane.showInputDialog("Enter your grade");
       Double score = Double.valueOf(result);

        //If the grade is more than or equals to 75 the system should print A.
        if (score >= 75){
            System.out.println("A");
        }

        //If the student score greater than or equals 60 and less than 75 the system should print B.
        if (score >= 60 && score < 75){
            System.out.println("B");
        }

        //If the score is greater than 50 and less than 60, the system should print C.
        else if (score > 50 && score < 60){
            System.out.println("C");
        }

        //If the score is greater than or equal 45 and less than 50 system should print D.
        else if (score >= 45 && score < 50){
            System.out.println("D");
        }

        //If the score is greater than or equal 40 and less than 45 the system should print E.
        if (score >= 40 && score < 45){
            System.out.println("E");
        }
    }
}
