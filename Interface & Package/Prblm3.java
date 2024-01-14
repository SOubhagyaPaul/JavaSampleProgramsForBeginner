import my_interfaces.Interface02;

//Create a private inner class that implements a public interface. Write a method that
//returns a reference to an instance of the private inner class, up cast to the interface. Show
//that the inner class is completely hidden by trying to downcast to it.

public class Prblm3 {
	private class Inner implements Interface02{		//implements a public interface
		Inner(){
			System.out.println("Executed");
		}
		Interface02 func(){
			return new Inner();		//returns a reference to an instance of 
									//the private inner class, up cast to the interface
		}
	}
	public static void main(String[] args) {
		Prblm3 ob = new Prblm3();
		Prblm3.Inner in = ob.new Inner();
		in.func();
	}

}

/*
output:
Executed
Executed
*/