package day1;
import java.util.Scanner;


/*Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a program to merge them into single sorted array C that contains every item from arrays. A & B, in ascending order.*/

public class prblm7_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in first array : ");
		int n1=sc.nextInt();
		System.out.println("Enter the number of element in second array : ");
		int n2=sc.nextInt();
		int arr1[]= new int[n1];
		int arr2[]=new int[n2];
		int result[]=new int[n1+n2];

		for(int i=0;i<arr1.length;i++){
			System.out.println("Enter for first array at index "+i+": ");
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<arr2.length;j++){
			System.out.println("Enter for second array at index "+j+": ");
			arr2[j]=sc.nextInt();
		}
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				result[k]=arr1[i];
				i++;
				k++;
			}
			else if(arr1[i]>arr2[j]){
				result[k]=arr2[j];
				j++;
				k++;
			}
			else{			//for duplicate value
				result[k]=arr1[i];
				i++;
				j++;
				k++;
			}
		}
		if(i<arr1.length){
			while(i<arr1.length){
				result[k]=arr1[i];
				i++;
				k++;
			}
		}
		if(j<arr2.length){
			while(j<arr2.length){
				result[k]=arr2[j];
				j++;
				k++;
			}
		}
		System.out.println("The sorted array is : ");
		for(int a=0;a<result.length;a++){
			System.out.print("\t"+result[a]);
		}

		
	}

}


/*
output:
Enter the number of element in first array : 
4
Enter the number of element in second array : 
5
Enter for first array at index 0: 
12
Enter for first array at index 1: 
23
Enter for first array at index 2: 
45
Enter for first array at index 3: 
67
Enter for second array at index 0: 
1
Enter for second array at index 1: 
15
Enter for second array at index 2: 
88
Enter for second array at index 3: 
90
Enter for second array at index 4: 
94
The sorted array is : 
	1	12	15	23	45	67	88	90	94
	-------------------------------------------------

Enter the number of element in first array : 
4
Enter the number of element in second array : 
4
Enter for first array at index 0: 
12
Enter for first array at index 1: 
18
Enter for first array at index 2: 
40
Enter for first array at index 3: 
45
Enter for second array at index 0: 
3
Enter for second array at index 1: 
16
Enter for second array at index 2: 
30
Enter for second array at index 3: 
46
The sorted array is : 
	3	12	16	18	30	40	45	46


*/