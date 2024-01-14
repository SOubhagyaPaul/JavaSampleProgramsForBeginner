package day3;
/*
 * Write a program to create a class named Vehicle having protected instance 
 * variables regnNumber, speed, color, ownerName and a method showData ( ) to show 
 * “This is a vehicle class”. Inherit the Vehicle class into subclasses named 
 * Bus and Car having individual private instance variables routeNumber in Bus 
 * and manufacturerName in Car and both of them having showData ( ) method showing all details of 
 * Bus and Car respectively with content of the super class’s showData ( ) method.
 */

class Vehicle{
	protected String regnNumber,color,ownerName;
	protected int speed;
	Vehicle(String regnNumber,int speed, String color,String ownerName){
		this.regnNumber=regnNumber;
		this.speed=speed;
		this.color=color;
		this.ownerName=ownerName;
	}
	void showData() {
		System.out.println("This is a vehicle class.");
	}
}
class Bus extends Vehicle{
	private String routeNumber;
	Bus(String regnNumber,int speed, String color,String ownerName,String routeNumber){
		super(regnNumber,speed,color,ownerName);
		this.routeNumber=routeNumber;
	}
	void showData() {
		super.showData();
		System.out.println("The registration number is : "+this.regnNumber);
		System.out.println("The registration color is : "+this.color);
		System.out.println("The registration speed is : "+this.speed);
		System.out.println("The registration owner name is : "+this.ownerName);
		System.out.println("The registration route number is : "+this.routeNumber);
	}
		
}
class Car extends Vehicle{
	private String manufacturerName;
	Car(String regnNumber,int speed, String color,String ownerName,String manufacturerName){
		super(regnNumber,speed,color,ownerName);
		this.manufacturerName=manufacturerName;
	}
	void showData() {
		super.showData();
		System.out.println("The registration number is : "+this.regnNumber);
		System.out.println("The registration color is : "+this.color);
		System.out.println("The registration speed is : "+this.speed);
		System.out.println("The registration owner name is : "+this.ownerName);
		System.out.println("The registration manufacturer name is : "+this.manufacturerName);
	}
		
}
public class Prblm3 {

	public static void main(String[] args) {
		
		Vehicle obj;
		obj=new Bus("WB 12A3 1987",180,"Blue","Ram","211");
		obj.showData();
		System.out.println();
		obj=new Car("WB 14AD 2002",200,"Red","Shyam","Ford");
		obj.showData();

	}

}


/*
 * This is a vehicle class.
The registration number is : WB 12A3 1987
The registration color is : Blue
The registration speed is : 180
The registration owner name is : Ram
The registration route number is : 211

This is a vehicle class.
The registration number is : WB 14AD 2002
The registration color is : Red
The registration speed is : 200
The registration owner name is : Shyam
The registration manufacturer name is : Ford

 */
