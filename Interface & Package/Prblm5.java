/*
 * 
Complete the following:
i) Create a package named org.shapes.
ii) Create some classes in the package representing some common geometric shapes like
Square, Triangle, Circle and so on. The classes should contain area and perimeter
methods in them.
iii) Compile the package.
iv) Use this package to find area and perimeter of different shapes as chosen by the user.
 */
import org.shapes.*;

public class Prblm5 {

	public static void main(String[] args) {
		Square s=new Square(5);
		double s_area=s.area();
		Cube c=new Cube(6);
		double c_area=c.area();
		Triangle t=new Triangle(5,9);
		double t_area=t.area();
		Rectangle r=new Rectangle(6,3);
		double r_area=r.area();
		Circle cir=new Circle(4);
		double cir_area=cir.area();
		System.out.println("The area of Square: "+s_area);
		System.out.println("The area of cube: "+c_area);
		System.out.println("The area of triangle: "+t_area);
		System.out.println("The area of rectangle: "+r_area);
		System.out.println("The area of Circle: "+cir_area);

	}

}
/*
 * The area of Square: 25.0
The area of cube: 216.0
The area of triangle: 22.5
The area of rectangle: 18.0
The area of Circle: 50.272

 */
