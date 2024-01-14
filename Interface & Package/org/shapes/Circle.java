package org.shapes;

public class Circle {
	double r;
	public Circle(double r){
		this.r=r;
	}
	public double area() {
		return 3.142*r*r;
	}
}
