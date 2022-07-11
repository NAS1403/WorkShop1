package com.bridgelabz.WorkShop1;
import java.util.Scanner;

public class VendingMachine {
    static int i;
    static int totalNotes;
    static int[] notes = {1000,500,100,50,10,5,2,1};
    static int money;
    static int calculate(int money,int[] notes ) {

        if(money==0)
        {
            return -1 ;
        }
        else {
            if(money>=notes[i]) {
                int numOfNotes =money/notes[i];
                money = money%notes[i];
                totalNotes += numOfNotes;
                System.out.println(notes[i]+   " notes---> " +numOfNotes );
            }
        }
        i++;
        return calculate(money, notes);
    }
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Amount:");
        money =scr.nextInt();
        VendingMachine.calculate(money,notes);
        System.out.println("Total Number of Notes are :"+totalNotes);
    }

}

