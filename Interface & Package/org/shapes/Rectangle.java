package org.shapes;

public class Rectangle {
	double length,width;
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public double area() {
		return this.length*this.width;
	}
}
