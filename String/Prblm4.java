package day4;

import java.util.Scanner;

/*
 * Write a program to accept a string from the user and find out the following statistics:
(a) Count of uppercase character
(b) Count of lowercase character
(c) Count of digits
(d) Count of spaces
 */
public class Prblm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int upper = 0,lower = 0,num = 0,special = 0;
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                num++;
            else
                special++;
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + num);
        System.out.println("Special characters : " + special);
        sc.close();
	}

}

/*
 * Enter the string: 
TTT gh 57 ##4$sr @
Lower case letters : 4
Upper case letters : 3
Number : 3
Special characters : 8

 */
