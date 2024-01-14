package genricProgs;

class Stack<T>{
	int size;
	int top;
	T arr[];
	@SuppressWarnings("unchecked")
	Stack(int size){
		top=-1;
		this.size=size;
		arr= (T[]) new Object[size];
	}
	boolean isFull() {
		return top==size-1;	
	}
	boolean isEmpty() {
		return top==-1;
	}
	void push(T n) {
		if(isFull()) {
			System.out.println("The stack is in overflow condition.");
		}
		else
			arr[++top]=n;
	}
	public T pop(){
		if(isEmpty()){
			System.out.println("The stsack is empty.");
			return null;
		}
		else
			return arr[top--];
	}
	public void display1(){
		System.out.println("The stack view in LIFO manner: ");
		for(int i=this.top;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
}








public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<Integer>(5);
		s1.push(90);
		s1.push(70);
		s1.push(60);
		s1.push(30);
		s1.push(20);
		
		s1.display1();
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		System.out.println(s1.pop()+"Pooped");
		
		
	}

}


/*
 *The stack view in LIFO manner: 
20	30	60	70	90	20Pooped
30Pooped
60Pooped
70Pooped
90Pooped
The stsack is empty.
nullPooped
The stsack is empty.
nullPooped
*/