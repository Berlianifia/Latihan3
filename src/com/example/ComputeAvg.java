/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    private static int i;

    public static void main(String args[]) {
        double scores [] = new double[5];
        double sum = 0.0, avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
                
        System.out.println("Enter scores of 5 set");
        for(int i = 0;i < scores.length; i++){
            scores[i] = keyboard.nextInt();
        }//end for
        System.out.println("Display the scoresof 5 set");
        for(int i = 0;i < scores.length; i++){
            System.out.println(scores[i]);
        }//end for
        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[1];
            avg = sum/5;
        }//end for
        System.out.println("The average score of the class" + avg);
    }//end method main
}// end class setscores
      
