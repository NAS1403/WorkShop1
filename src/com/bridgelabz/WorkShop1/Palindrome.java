package com.bridgelabz.WorkShop1;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome");
        int num = scr.nextInt();
        int num1 = num;
        int rev = 0;
        while (num!=0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if (rev == num1){
            System.out.println(num1 + " is Palindrome");
        }
        else{
            System.out.println(num1+ " is not Palindrome");
        }
    }
}
