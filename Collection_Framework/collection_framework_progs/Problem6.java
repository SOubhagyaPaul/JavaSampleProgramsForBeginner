package collection_framework_progs;

import java.util.ArrayList;
import java.util.Scanner;

/*Write a java program to check the number where the difference between every adjacent digit should be 1
using ArrayList.*/


public class Problem6 {

	static boolean chack(ArrayList arr){
		if(arr.size()==1)
			return false;
		for(int i=0;i<arr.size()-1;i++)
			if (Math.abs((int)arr.get(i)-(int)arr.get(i+1))==1) return true;
		return false;
		
	}
	public static void main(String[] args) {
		
			ArrayList<Integer>arr=new ArrayList<Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number : ");
			int n= sc.nextInt();
			
			while(n>0) {
				arr.add(n%10);
				n=n/10;
			}
			System.out.println(chack(arr));
	
	}

}


/*
 * Enter the number : 
45
true
--------------------------
Enter the number : 
97
false

 * 
 */
