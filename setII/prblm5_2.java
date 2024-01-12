package day1;
import java.util.Scanner;
/*The straight-line method of computing the early depreciation of the value of an item is given by:
Depreciation = (Purchase price - Salvage value)/Years of service
Write a program to determine the salvage value of an item when the purchase price years of service & the annual preciation is given.*/

public class prblm5_2{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase value: ");
		float p=sc.nextFloat();
		System.out.println("Enter the Depreciation value: ");
		float d=sc.nextFloat();
		System.out.println("Enter the year of service: ");
		float y=sc.nextFloat();
		
		float sv;

		sv=(float)p-(d*y);
		System.out.println("The salvage value of that item: "+sv);
		

	}



}


/*
output:
Enter the purchase value: 
200
Enter the Depreciation value: 
4
Enter the year of service: 
1
The salvage value of that item: 196.0

*/