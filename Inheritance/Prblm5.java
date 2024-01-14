package day3;

import java.util.Scanner;

/*
 * Consider an example of book shop which sells books & video tapes. 
 * It’s modeled by Book & Tape classes. These two classes are inherited 
 * from the abstract class called Media. The Media class has common data 
 * members such as title & publication. The Book class has data member for
 *  storing a no. of pages in a book & Tape class has the playing time in 
 * a tape. Each class will have method such as read ( ) & show ( ). 
 * Write a program that models this class hierarchy & processes objects using reference to base class only.
 */

abstract class Media{
	String title ,publication;
	Scanner sc = new Scanner(System.in);
	abstract void read(); 
	abstract void get();
}
class Book extends Media{
	int pageNo;
	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("Enter the title:- ");
		this.title=sc.next();
		String d = sc.nextLine();
		System.out.println("Enter the publication:- ");
		this.publication=sc.next();
		d = sc.nextLine();
		System.out.println("Enter the noOfPages:- ");
		this.pageNo=sc.nextInt();
		
	}
	
	@Override
	void get() {
		// TODO Auto-generated method stub
		System.out.println("The book title is : "+this.title);
		System.out.println("The book publication is : "+this.publication);
		System.out.println("The book page numbber is : "+this.pageNo);
	}
	
}
class Tape extends Media{
	int playTime;
	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("Enter the title:- ");
		this.title=sc.nextLine();
		System.out.println("Enter the publication:- ");
		this.publication=sc.nextLine();
		System.out.println("Enter the Play time:- ");
		this.playTime=sc.nextInt();
		
	}
	@Override
	void get() {
		// TODO Auto-generated method stub
		System.out.println("The Tape title is : "+this.title);
		System.out.println("The Tape publication is : "+this.publication);
		System.out.println("The tape playing time is : "+this.playTime);
		
	}
}
public class Prblm5 {

	public static void main(String[] args) {
		
		Media obj=new Book();	//Book class object using reference to base class
		obj.read();
		obj.get();
		
		obj=new Tape();		//Tape class object using reference to base class
		obj.read();
		obj.get();
	}

}
/*
 * Enter the title:- 
Java the complete refrence
Enter the publication:- 
Mac graw hill
Enter the noOfPages:- 
2000
The book title is : Java
The book publication is : Mac
The book page numbber is : 2000
Enter the title:- 
RRR
Enter the publication:- 
svf
Enter the Play time:- 
3
The Tape title is : RRR
The Tape publication is : svf
The tape playing time is : 3
*/
