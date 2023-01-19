//Author: Gauri Chalak
//WAP to count the no. of palindrome words in a string

package com.question7;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String str1=sc.nextLine();
        String rev="",word="";
        int count=0;
        str1=str1+" ";
    
        for(int a=0;a<str1.length();a++)
        {
            if(str1.charAt(a)==' ')
            {
                if(word.equals(rev))
                {
                    count++;
                }    
                rev=" ";
                word=" ";
            }
            else
            {
                rev=str1.charAt(a)+rev;
                word=word+str1.charAt(a);
            }
        }
        System.out.println("Number of Palindrome Words : "+count);
	}

}
