package org.shapes;

public class Triangle {
	double h,b;
	public Triangle(double h,double b){
		this.h=h;
		this.b=b;
	}
	public double area() {
		return (this.h*this.b)/2;
	}
}

