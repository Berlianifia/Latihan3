/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArrayEx1 {

    public static void main(String args[]) {
        
       //int[] primeNum = new long[9];
        int[] even=new int[9];
        long[] primes = new long[10];
        primes[0] = 1;
        primes[1] = 1;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 1;
        System.out.println(primes[0]);

    }

}
