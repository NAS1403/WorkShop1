package com.bridgelabz.WorkShop1;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N");
        double n = scn.nextInt();
        double h=0.0;
        if (n>0){
            for (double i=1.0;i<=n;i++){
                h = h+(1/i);
            }
            System.out.println("Harmonic series for the number "+ n + " is " + h);
        }
        else{
            System.out.println("Enter positive integer");
        }
    }
}
