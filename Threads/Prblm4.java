/*Inherit a class from Thread and override the run( ) method. Inside run( ), print a
message, and then call sleep( ). Repeat this three times, then return from run( ).
Put a start-up message in the constructor and override finalize( ) to print a shut-
down message. Make a separate thread class that calls System.gc( ) and
System.runFinalization( ) inside run( ), printing a message as it does so. Make
several thread objects of both types and run them to see what happens.*/

class TripleSleep extends Thread {
	static int count; 			// counts the no. of threads created
	int tId; 					// thread id
	Thread t;

	TripleSleep(Thread t) {
		count++;
		tId = count;
		System.out.println("Initializing object " + tId);
		this.t = t;
	}

	protected void finalize() {
		System.out.println("Killing object " + tId);
	}

	public void run() {
		try {
			System.out.println("Object " + tId + " says 1");
			sleep(1500);
			System.out.println("Object " + tId + " says 2");
			sleep(1000);
			System.out.println("Object " + tId + " says 3");
			sleep(500);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		t.start(); // calling Finalizer thread 
	}
}

class Finalizer extends Thread {
	static int count; // counts the no. of threads created
	int tId; // thread id

	public Finalizer() {
		count++;
		tId = count;
	}

	public void run() {
		System.out.println("Running Finalizer" + tId + "...");
		System.runFinalization();
		System.out.println("Running Garbage Collector" + tId + "...");
		System.gc();
	}
}

public class A4 {
	public static void main(String[] args) {
		// Finalizer
		Finalizer f1 = new Finalizer();
		Finalizer f2 = new Finalizer();
		Finalizer f3 = new Finalizer();

		// TripleSleep
		TripleSleep t1 = new TripleSleep(f1);
		TripleSleep t2 = new TripleSleep(f2);
		TripleSleep t3 = new TripleSleep(f3);

		// thread calls
		t1.start();
		t2.start();
		t3.start();

	}
}
