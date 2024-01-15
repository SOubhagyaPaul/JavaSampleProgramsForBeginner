package MyThreadsCodes;
//DeadLock
class A{
	synchronized void foo(B b) {
		String name= Thread.currentThread().getName();
		System.out.println(name+" Entered in A.foo");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(name+"Trying to call B.last");
	b.last();
	}
	synchronized void last() {
		System.out.println("Inside A.last");
	}
}


class B{
	synchronized void bar(A a) {
		String name=Thread.currentThread().getName();
		System.out.println(name+"Entered in B.bar");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"Trying to call A.last");
		a.last();
	}
	synchronized void last() {
		System.out.println("Inside B.last");
	}
	
}

class Deadlock implements Runnable{
	A a=new A();
	B b=new B();
	Thread t;
	Deadlock(){
		t=new Thread(this);
	}
	void deadlockStart() {
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.bar(a);
		System.out.println("Back in other thread");
	}
	
}


public class Prblm8 {
	
	public static void main(String[] args) {
		Deadlock d1=new Deadlock();
		d1.deadlockStart();

	}

}


/*
 * Thread-0Entered in B.bar
main Entered in A.foo
Thread-0Trying to call A.last
mainTrying to call B.last

 */
