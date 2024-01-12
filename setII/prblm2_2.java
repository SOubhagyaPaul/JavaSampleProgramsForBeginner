package day1;
import java.util.Scanner;
/*Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50
(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
(Or)
Total in Maths & Physics>=150
Given the marks in the 3 subjects of n (user input) students, write a program to process
the applications to list the eligible candidates. */




public class prblm2_2{

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n= sc.nextInt();
		int mathMarks[]= new int[n];
		int chemMarks[]= new int[n];
		int phyMarks[]= new int[n];
		for(int i=0;i<n;i++){
			System.out.print("\nEnter the maths marks for student "+(i+1)+": ");
			mathMarks[i]=sc.nextInt();
			System.out.print("\nEnter the Chemistry marks for student "+(i+1)+": ");
			chemMarks[i]=sc.nextInt();
			System.out.print("\nEnter the Physics marks for student "+(i+1)+": ");
			phyMarks[i]=sc.nextInt();
		}
		System.out.println("The eligible candidates are : ");
		for(int i=0;i<n;i++){
			int total=mathMarks[i]+phyMarks[i];
			if((mathMarks[i]>=60 && chemMarks[i]>=40 && phyMarks[i]>=50) || total>=150){
				System.out.println("student "+(i+1));
			}
		}

	}

}


/*
 * output: 
 * Enter the number of students : 
3

Enter the maths marks for student 1: 90

Enter the Chemistry marks for student 1: 80

Enter the Physics marks for student 1: 75

Enter the maths marks for student 2: 50

Enter the Chemistry marks for student 2: 41

Enter the Physics marks for student 2: 60

Enter the maths marks for student 3: 30

Enter the Chemistry marks for student 3: 41

Enter the Physics marks for student 3: 44
The eligible candidates are : 
student 1
---------------------------------------------------

 * 
 * 
 * 
 * 
 * 
 */
