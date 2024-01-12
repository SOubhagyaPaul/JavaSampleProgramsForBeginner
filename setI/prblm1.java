package day1;
import java.util.Scanner;
 
/*Write a program that reads three coordinate and calculate the side of triangle.
Check whetherthese numbers can be considered as the three sides of a triangle. 
If so, find the type(isosceles, equilateral or right-angled) 
and area of the triangle.*/


public class prblm1 {


	public static void main(String[] args) {
		float x1,y1,x2,y2,x3,y3;
		float s1,s2,s3;
		double area,s;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter coordinate for x axis first vertex : ");
		x1=sc.nextFloat();
		System.out.print("Enter coordinate for y axis first vertex : ");
		y1=sc.nextFloat();
		System.out.print("Enter coordinate for x axis second vertex : ");
		x2=sc.nextFloat();
		System.out.print("Enter coordinate for y axis second vertex : ");
		y2=sc.nextFloat();
		System.out.print("Enter coordinate for x axis third vertex : ");
		x3=sc.nextFloat();
		System.out.print("Enter coordinate for y axis third vertex : ");
		y3=sc.nextFloat();
		
		s1=(int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		s2=(int)Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
		s3=(int)Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
		System.out.print("The value of sides :  "+s1+" "+s2+" "+s3);
		if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2){
			System.out.println("\nCan be considered as the three sides of a triangle. ");
			if(s1==s2 && s2==s3){
				System.out.println("This is a equilateral Triangle");
			}
			else if(s1==s2 || s2==s3 || s3==s1){
				System.out.println("This is a Isosceles Triangle");
			}
			else
				System.out.println("This is a Scalene Triangle.");
			
			if(Math.pow(s1,2)+ Math.pow(s2,2)== Math.pow(s3,2)|| Math.pow(s2,2)+ Math.pow(s3,2)== Math.pow(s1,2) || Math.pow(s3,2)+ Math.pow(s1,2)== Math.pow(s2,2)){
				
				System.out.println("This is a right-angled Triangle");
			}
			//System.out.println(" "+x1+" "+x2+" "+x3);
			s=(s1+s2+s3)/2;
			area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
			System.out.println("The area of the triangle is :  "+area);
			
		}
		else
			System.out.println("This is not a tringle");		
		
	}
}




/*
 *Enter coordinate for x axis first vertex : -6
Enter coordinate for y axis first vertex : -2
Enter coordinate for x axis second vertex : -2
Enter coordinate for y axis second vertex : -3
Enter coordinate for x axis third vertex : 2
Enter coordinate for y axis third vertex : -2
The value of sides :  4.0 4.0 8.0This is not a tringle
----------------------------------------------------------
Enter coordinate for x axis first vertex : -6
Enter coordinate for y axis first vertex : -2
Enter coordinate for x axis second vertex : -2
Enter coordinate for y axis second vertex : 3
Enter coordinate for x axis third vertex : 2
Enter coordinate for y axis third vertex : -2
The value of sides :  6.0 6.0 8.0
Can be considered as the three sides of a triangle. 
This is a Isosceles Triangle
The area of the triangle is :  20.0
-------------------------------------------------------------
Enter coordinate for x axis first vertex : -1
Enter coordinate for y axis first vertex : 1.5
Enter coordinate for x axis second vertex : 1
Enter coordinate for y axis second vertex : -2
Enter coordinate for x axis third vertex : 3
Enter coordinate for y axis third vertex : 1.5
The value of sides :  4.0 4.0 4.0
Can be considered as the three sides of a triangle. 
This is a equilateral Triangle
The area of the triangle is :  7.0
--------------------------------------------------------
Enter coordinate for x axis first vertex : 0
Enter coordinate for y axis first vertex : 2
Enter coordinate for x axis second vertex : 0
Enter coordinate for y axis second vertex : 14
Enter coordinate for x axis third vertex : 9
Enter coordinate for y axis third vertex : 2
The value of sides :  12.0 15.0 9.0
Can be considered as the three sides of a triangle. 
This is a Scalene Triangle.
This is a right-angled Triangle
The area of the triangle is :  54.0



 *
 *
 *
 *
 *
 */


