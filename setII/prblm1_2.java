package day1;
import java.util.Scanner;

/*Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to print the number of students who have obtain marks:
(a) in the range 81 to 100 (b) in the range 61 to 80
(c) in the range 41 to 60 (d) in the range 0 to 40*/

public class prblm1_2 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the no of students : \n");
		int n=sc.nextInt();
		float marks[]=new float[n];
		int countA=0,countB=0,countC=0,countD=0;
		for(int i=0;i<marks.length;i++){
			System.out.print("Enter the number of Student"+i+" : ");
			marks[i]=sc.nextFloat();
			
		}
		for(int i=0;i<marks.length;i++){
			if(marks[i]>=81 && marks[i]<=100)
				countA++;
			if(marks[i]>=61 && marks[i]<=80)
				countB++;
			if(marks[i]>=41 && marks[i]<=60)
				countC++;
			if(marks[i]>=0 && marks[i]<=40)
				countD++;
		}
		
		System.out.println("The number of students got marks in range 81 to 100: "+countA);
		System.out.println("The number of students got marks in range 61 to 80: "+countB);
		System.out.println("The number of students got marks in range 41 to 60: "+countC);
		System.out.println("The number of students got marks in range 0 to 40: "+countD);



		
	}

}


/*
output:
 Enter the no of students : 
6
Enter the number of Student0 : 90
Enter the number of Student1 : 80
Enter the number of Student2 : 40
Enter the number of Student3 : 51
Enter the number of Student4 : 39
Enter the number of Student5 : 61
The number of students got marks in range 81 to 100: 1
The number of students got marks in range 61 to 80: 2
The number of students got marks in range 41 to 60: 1
The number of students got marks in range 0 to 40: 2

*/