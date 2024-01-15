package MyThreadsCodes;
/*
 * Create two Thread subclasses, one with a run( ) that starts up, captures the reference of
the second Thread object and then calls wait( ). The other class’ run( ) should call
notifyAll( ) for the first thread after some number of seconds have passed, so the first
thread can print a message.
 */

class Resource{
	synchronized void waiter() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized void notifyer() {
		notifyAll();
	}
}


class Printmsg extends Thread{
	Thread t;
	Resource ob;
	Printmsg(Thread t,Resource ob){
		this.t=t;
		this.ob=ob;
	}
	@Override
	public void run() {
        t.start();
        System.out.println("Waiting to be notified");
        ob.waiter();
        System.out.println("Wait over");
}
}
class NtfyThrd extends Thread{
	Resource ob;
	NtfyThrd(Resource ob){
		this.ob=ob;
	}
	@Override
	public void run() {
		  try {
	            Thread.sleep(5000); // Sleep for 5 seconds
	        } catch (InterruptedException e) {
	            System.out.println("NotifyingThread interrupted");
	        }
		  System.out.println("Notifying another Thread now");
		  ob.notifyer();
	}
}
public class Prblm5 {

	public static void main(String[] args) {
		Resource obj= new Resource();
		NtfyThrd n=new NtfyThrd(obj);
		new Printmsg(n,obj).start();;
		
	}
}
