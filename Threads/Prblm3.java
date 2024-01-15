package MyThreadsCodes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/*
 * Write a program to sort a list of strings using multithreading. Create one of the threads
that take a string as input from the user, another thread that sorts the strings and finally
another thread that displays the sorted list of strings. Each of the input, sort, and display
methods is to be synchronized.
 */
class StrSort{
	ArrayList<String> strLst = new ArrayList<String>();
	boolean flag=false;
	synchronized void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String or enter exit to stop input");
		while(true) {
			String s=sc.nextLine();
			if(s.equals("exit"))
				break;
			strLst.add(s);
		}
		sc.close();
	}
	synchronized void sort(){
		Collections.sort(strLst);
		flag=true;
		notify();
	}
	synchronized void output(){
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(strLst);
	}	
}

class InpuThread implements Runnable{
	StrSort ob;
	Thread t;
	InpuThread(StrSort ob){
		t = new Thread(this);
		this.ob=ob;
	}
	@Override
	public void run() {
		ob.input();
		
	}
	
}
class SortStrThread implements Runnable{
	StrSort ob;
	Thread t;
	SortStrThread(StrSort ob){
		t = new Thread(this);
		this.ob=ob;
	}
	@Override
	public void run() {
		ob.sort();
		
	}
	
}
class DispThread implements Runnable{
	StrSort ob;
	Thread t;
	DispThread(StrSort ob){
		this.ob=ob;
		t = new Thread(this);
	}
	@Override
	public void run() {
		ob.output();
		
	}
}


public class Prblm3 {

	public static void main(String[] args) {
		StrSort ob=new StrSort();
		InpuThread obj1 =new InpuThread(ob);
		SortStrThread obj2=new SortStrThread(ob);
		DispThread obj3=new DispThread(ob);
		
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();
	}

}
