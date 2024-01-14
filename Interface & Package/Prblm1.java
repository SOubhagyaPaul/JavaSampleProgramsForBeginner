
//Create three interfaces, each with two methods. Inherit a new interface from the three,
//adding a new method. Create a class by implementing the new interface and also
//inheriting from a concrete class. Now write four methods, each of which takes one of the
//four interfaces as an argument. In main( ), create an object of your class and pass it to
//each of the methods.
class Super{	//concrete class
	
}
interface A{			//creating three interface and two mwthod in it A,B,C
	void func_A1();
	void func_A2();
}
interface B{
	void func_B1();
	void func_B2();
}
interface C{
	void func_C1();
	void func_C2();
}

interface D extends A,B,C{		//Inherit a new interface from the three
	void func_D();
}
class sub extends Super implements D{	//class by implementing the new interface and also inheriting from a concrete class

	public void func_A1() {
		System.out.println("method A1 ");
		
	}

	public void func_A2() {
		System.out.println("method A2 ");
		
	}

	public void func_B1() {
		System.out.println("method B1 ");
		
	}

	public void func_B2() {
		System.out.println("method B2 ");
		
	}

	public void func_C1() {
		System.out.println("method C1 ");
		
	}

	public void func_C2() {
		System.out.println("method C2 ");
		
	}

	public void func_D() {
		System.out.println("method D ");
		
	}
	
}


public class Prblm1 {

	public static void m1(A objA){		//four methods, each of which takes one of the
										//four interfaces as an argument
		objA.func_A1(); 
		objA.func_A2();
	}
	public static void m2(B objB) {
		objB.func_B1();
		objB.func_B2();
	}
	public static void m3(C objC) {
		objC.func_C1();
		objC.func_C2();
	} 
	public static void m4(D objD) {
		objD.func_D(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub ob= new sub();					//main( ), create an object of your class and pass it to
											//each of the methods
		m1(ob);
		m2(ob);
		m3(ob);
		m4(ob);
	}

}


/*
 * 
 * output:--
 * method A1 
   method A2 
   method B1 
   method B2 
   method C1 
method C2 
method D 

 */


