/*
 * Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for getting data and printing the attributes. Create a class hostel
containing hostelName, hostelLocation and numberofRooms. The class contains methods
for getting and printing the attributes. Then write Student class extending the Hostel
class and implementing the Department interface. This class contains attributes
studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
printData methods for this class. Also implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program should be menu
driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.
 */

import java.util.Scanner;

interface Department{
	String deptName="MCA";
	String deptHead="SVB";
	abstract void getDeptName();
	abstract void getDeptHead();
}
class Hostel{
	String hostelName, hostelLocation, numberofRooms;
	Hostel(String hostelName,String hostelLocation,String numberofRooms){
		this.hostelName=hostelName;
		this.hostelLocation=hostelLocation;
		this.numberofRooms=numberofRooms;
	}
	void disp(){
		System.out.println("The hostel name is"+this.hostelName);
		System.out.println("The hostel location is"+this.hostelLocation);
		System.out.println("The no of rooms are "+this.numberofRooms);
	}
}
class Student extends Hostel implements Department{
	String studentName, regdNo, electiveSub; 
	double avgMarks;
	
	Student(String studentName,String regdNo,String electiveSub, double avgMarks, String hostelName, String hostelLocation, String numberofRooms) {
		super(hostelName, hostelLocation, numberofRooms);
		this.studentName=studentName;
		this.regdNo=regdNo;
		this.electiveSub=electiveSub;
		this.avgMarks=avgMarks;
	}
	void printData() {
		
		System.out.println("The student name is" +this.studentName);
		System.out.println("The reg no of the student :"+this.regdNo);
		System.out.println("The elective subject of the student "+this.electiveSub);
		System.out.println("The avg marks of the student : "+this.avgMarks);
		super.disp();
	}
	@Override
	public void getDeptName() {
		// TODO Auto-generated method stub
		System.out.println("The dept name is "+deptName);
	}

	@Override
	public void getDeptHead() {
		// TODO Auto-generated method stub
		System.out.println("The dept name is "+deptHead);
	}
	
}
public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Student student = null;

	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Admit new student");
	            System.out.println("2. Migrate a student");
	            System.out.println("3. Display details of a student");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                	System.out.print("Enter Student Name: ");
	                    String studentName = sc.nextLine();
	                    sc.nextLine();
	                    System.out.print("Enter Registration Number: ");
	                    String regdNo = sc.nextLine();
	                    sc.nextLine(); // Consume the newline character
	                    System.out.print("Enter Elective Subject: ");
	                    String electiveSub = sc.nextLine();
	                    System.out.print("Enter Average Marks: ");
	                    double avgMarks = sc.nextDouble();
	                    System.out.print("Enter Hostel Name: ");
	                    String hostelName = sc.nextLine();
	                    System.out.print("Enter Hostel Location: ");
	                    String hostelLocation = sc.nextLine();
	                    System.out.print("Enter Number of Rooms: ");
	                    String numberofRooms = sc.nextLine();
	                    student = new Student(studentName,regdNo, electiveSub, avgMarks,  hostelName,hostelLocation, numberofRooms);
	                    break;
	                case 2:
	                    if (student != null) {
	                        student.printData();
	                    } else {
	                        System.out.println("No student data available. Please admit a new student first.");
	                    }
	                    break;
	                case 3:
	                    if (student != null) {
	                        student.printData();
	                    } else {
	                        System.out.println("No student data available. Please admit a new student first.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }

	        } while (choice != 0);
	}

}

/*
 * Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
0. Exit
Enter your choice: 1
Enter Student Name: soubhagya
Enter Registration Number: A01
math
Enter Elective Subject: math
Enter Average Marks: 80
Enter Hostel Name: Enter Hostel Location: AO1
Enter Number of Rooms: 700

Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
0. Exit
Enter your choice: 2
The student name is
The reg no of the student :A01
The elective subject of the student math
The avg marks of the student : 80.0
The hostel name is
The hostel location isAO1
The no of rooms are 700

Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
0. Exit
Enter your choice: 3
The student name is
The reg no of the student :A01
The elective subject of the student math
The avg marks of the student : 80.0
The hostel name is
The hostel location isAO1
The no of rooms are 700

Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
0. Exit
Enter your choice: 0
Exiting the program. Goodbye!

 */
