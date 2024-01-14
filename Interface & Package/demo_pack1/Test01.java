package demo_pack1;
import my_interfaces.Intrface01;
public class Test01 {			//a class in a
								//separate package. Add a protected inner class that implements the interface.
	 protected class InnerDemo implements Intrface01
	    {
	    	public InnerDemo(){}
	       public void one() {
	    	   System.out.println("Test01.InnerDemo.one");
	       }
	       public void demo() {} 
	    }
}
