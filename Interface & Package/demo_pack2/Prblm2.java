package demo_pack2;
import demo_pack1.Test01;
import my_interfaces.Intrface01;
//Create an interface with at least one method, in its own package. Create a class in a
//separate package. Add a protected inner class that implements the interface. In a third
//package, inherit from your class and, inside a method, return an object of the protected
//inner class, up casting to the interface during the return.


public class Prblm2 extends Test01 {		//In a third
											//package, inherit from your class
	Intrface01 foo(){
		InnerDemo ob=new InnerDemo();
		ob.one();
        return (Intrface01)ob;				//return an object of the protected
        									//inner class, up casting to the interface during the return
    }	
		public static void main(String []args){
			Prblm2 ob=new Prblm2();
			ob.foo();
		}

}
