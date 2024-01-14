package collection_framework_progs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/*write a program that reads in a series of first names and stores them in a LinkedList.Do not store duplicate names.
 * Allow the user to search for a first name.*/
public class problm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of name you want to store");
		int n =sc.nextInt();
		sc.nextLine();
		LinkedList<String> lst=new LinkedList<String>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name: ");
			String s=sc.nextLine();
			if(lst.contains(s)==true) {
				System.out.println("The element is duplicate.");
				i--;
			}
			else
				lst.add(s);
		}
		
		
		Iterator<String>itr=lst.iterator();
		System.out.println("The elements of linked list : ");
		while(itr.hasNext())
				System.out.println(itr.next());
		
		
		System.out.println("Enter the element to search : ");
		 String search = sc.nextLine();
	        if(lst.contains(search))
	           System.out.println(" The element found" );
	        else
	           System.out.println("The element not found");
		
	        sc.close();
	}

}


/*
output:

Enter the number of name you want to store
5
Enter the name: 
AAA
Enter the name: 
CCC
Enter the name: 
III
Enter the name: 
OOO
Enter the name: 
JJJ
The elements of linked list : 
AAA
CCC
III
OOO
JJJ
Enter the element to search : 
OOO
 The element found

-------------------------------------------
Enter the number of name you want to store
5
Enter the name: 
AAA
Enter the name: 
AAA
The element is duplicate.
Enter the name: 
BBB
Enter the name: 
DDD
Enter the name: 
III
Enter the name: 
PPP
The elements of linked list : 
AAA
BBB
DDD
III
PPP
Enter the element to search : 
UUU
The element not found


*/