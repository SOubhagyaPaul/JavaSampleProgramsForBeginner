package day3;
/*
 * Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
variables and methods for each class. The private instance variables of Quadrilateral should
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
instantiates objects of your classes and outputs each object's area (except Quadrilateral).
 */

abstract class Quadrilateral{
	double x1,y1,x2,y2,x3,y3,x4,y4,s1,s2,s3,s4;
	Quadrilateral(int x1,int y1,int x2,int y2, int x3, int y3, int x4, int y4)
	{
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
		s1=(int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		s2=(int)Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
		s3=(int)Math.sqrt(Math.pow((x3-x4),2) + Math.pow((y3-y4),2));
		s4=(int)Math.sqrt(Math.pow((x4-x1),2) + Math.pow((y4-y1),2));
	}
	
	
	abstract void area();
	
}
class Trapezoid extends Quadrilateral{
	Trapezoid(int x1,int y1,int x2,int y2, int x3, int y3, int x4, int y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void area(){
		System.out.println("Area of Trapezoid");
	}	
}
class Parallelogram extends Quadrilateral{
	Parallelogram(int x1,int y1,int x2,int y2, int x3, int y3, int x4, int y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void area(){
		System.out.println("Area of Parallelogram");
	}
	
}
class Rectangle extends Quadrilateral{
	Rectangle(int x1,int y1,int x2,int y2, int x3, int y3, int x4, int y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void area(){
		System.out.println("Area of Rectangle");
	}
}
class Square extends Quadrilateral{
	Square(int x1,int y1,int x2,int y2, int x3, int y3, int x4, int y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void area(){
		System.out.println("Area of Square");
	}
}


public class Prblm1 {
	public static void main(String[] args) {
		Quadrilateral obj1=new Trapezoid(11,5,6,9,4,8,2,3); 
		Quadrilateral obj2=new Parallelogram(11,5,6,9,4,8,2,3);
		Quadrilateral obj3=new Rectangle(11,5,6,9,4,8,2,3);
		Quadrilateral obj4=new Square(11,5,6,9,4,8,2,3); 
		obj1.area();
		obj2.area();
		obj3.area();
		obj4.area();
		
	}

}
