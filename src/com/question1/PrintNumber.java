//Author:Gauri Chalak
 //Program to print first and last digit of a number

package com.question1;

import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int firstDigit=num;
        while(firstDigit>=10) 
        {
            firstDigit/=10;
        }

        int lastDigit=num%10;

        System.out.println("First digit of the given is : "+firstDigit);
        System.out.println("Last digit of the given is : "+lastDigit);
    }
}