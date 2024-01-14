package day3;
/*
 * Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
these two methods in each of the derived classes to calculate the volume and whole surface
area of each type of three-dimensional objects. The dimensions of the objects are to be taken
from the users and passed through the respective constructors of each derived class. Write a
main method to test these classes.
 */

abstract class ThreeDObject{
	abstract void wholeSurfaceArea ();
	abstract void volume ();
}
class Box extends ThreeDObject{
	double l,w,h;
	Box(double l,double w,double h ){
		this.l=l;
		this.w=w;
		this.h=h;
	}
	
	void wholeSurfaceArea() {
		// TODO Auto-generated method stub
		double area=2*(l*w + w*h + h*l);
		System.out.println("The Area of Box is : "+area);
	}

	void volume() {
		// TODO Auto-generated method stub
		double vol=l*w*h;
		System.out.println("The vloume of Box is : "+vol);
	}
	
}
class Cube extends ThreeDObject{
	double a;
	Cube(double a){
		this.a=a;
	}
	void wholeSurfaceArea() {
		// TODO Auto-generated method stub
		double area= 6*a*a;
		System.out.println("The Area of Cube is : "+area);
	}

	void volume() {
		// TODO Auto-generated method stub
		double vol=a*a*a;
		System.out.println("The vloume of Cube is : "+vol);
	}
	
}
class Cylinder extends ThreeDObject{
	double r,h;
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}
	void wholeSurfaceArea() {
		// TODO Auto-generated method stub
		double sarea = 2 * Math.PI * r * (r + h);
		System.out.println("The Area of Cylinder is : "+sarea);
	}

	void volume() {
		// TODO Auto-generated method stub
		double vol = Math.PI * r * r * h;
		System.out.println("The vloume of Cylinder is : "+vol);
	}
	
}
class Cone extends ThreeDObject{
	double r,h,s;
	Cone(double r,double h){
		this.r=r;
		this.h=r;
		this.s=Math.sqrt(r*r + h*h);
	}
	void wholeSurfaceArea() {
		// TODO Auto-generated method stub
		 double sarea = (Math.PI * this.r * this.r) + (Math.PI * this.r * this.s);
		System.out.println("The Area of Cone is : "+sarea);
	}

	void volume() {
		// TODO Auto-generated method stub
		 double vol = (Math.PI *r*r* h)/ 3;
		System.out.println("The vloume of Cone is : "+vol);
	}
	
}
public class Prblm2 {
	

	public static void main(String[] args) {
		ThreeDObject obj;
		 
		obj=new Box(12,4,5);
		 obj.wholeSurfaceArea();
		 obj.volume();
		
		 obj=new Cube(5);
		 obj.wholeSurfaceArea();
		 obj.volume();
		 
		 obj=new Cylinder(10,5);
		 obj.wholeSurfaceArea();
		 obj.volume();
		 
		 obj=new Cone(8,6);
		 obj.wholeSurfaceArea();
		 obj.volume();
	}

}

/*
 * The Area of Box is : 256.0
The vloume of Box is : 240.0
The Area of Cube is : 150.0
The vloume of Cube is : 125.0
The Area of Cylinder is : 942.4777960769379
The vloume of Cylinder is : 1570.7963267948967
The Area of Cone is : 452.3893421169302
The vloume of Cone is : 536.165146212658
*/
