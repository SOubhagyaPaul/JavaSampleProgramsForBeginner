package day1;
import java.util.Scanner;

/*Write a program to find the roots (real and imaginary) of the 
quadratic equation of the form ax2+ bx + c = 0.*/

public class prblm2 {


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double r1,r2;
		System.out.print("Enter the value of a : ");
		double a= sc.nextDouble();
		System.out.print("Enter the value of b : ");
		double b= sc.nextDouble();
		System.out.print("Enter the value of c : ");
		double c= sc.nextDouble();
		
		double d= Math.pow(b, 2)- 4*a*c;
		if(d>0.0){
			System.out.println("The roots are real.");
			r1= (-b+ Math.sqrt(d))/(2*a);
			r2= (-b- Math.sqrt(d))/(2*a);
			System.out.println("The value of first root : "+r1);
			System.out.println("The value of second root: "+r2);
		}
		else if(d==0.0)
		{
			System.out.println("Roots are same.");
			r1= -b/ 2.0*a;
			System.out.println("The value of the root is :"+r1);
		}
		else{
			System.out.println("The roots are not real.");
			System.out.println("The first root is "+ (-b/2*a)+"+i"+Math.sqrt(-d)/(2*a)+" Another root is "+(-b/2*a)+"-i"+Math.sqrt(-d)/(2*a));
		}
		
		

	}

}


/*
 * Output:
 * 
 * Enter the value of a : 1
Enter the value of b : -6
Enter the value of c : 13
The roots are not real.
The first root is 3.0+i2.0 Another root is 3.0-i2.0
-------------------------------------------------------
Enter the value of a : 1
Enter the value of b : 13
Enter the value of c : 30
The roots are real.
The value of first root : -3.0
The value of second root: -10.0
---------------------------------------
Enter the value of a : 4
Enter the value of b : -4
Enter the value of c : 1
Roots are same.
The value of the root is :8.0

 * 
 * 
 * 
 */