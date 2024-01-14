package genricProgs;
/*
 * Design the Queue Using Generic Class that can contain any type of data. Implement the
insertion, deletion methods.

 */
class Queue<T>{ 
	int front,rear,size;
	T arr[];
	@SuppressWarnings("unchecked")
	Queue(int size){
		this.size=size;
		front=-1;
		rear=-1;
		arr=(T[])new Object[size];
	}
	boolean isEmpty()
	{
		return front == -1;
	}

	boolean isFull()
	{
		return (front == 0 && rear == size-1);
	}	
	void Enqueue(T n) {
		if(isFull()) {
			System.out.println("Queue is in Overflow condition ");
			return;
		}
		else if(isEmpty()) {
			front=0;
			rear=0;
		}
		else
			rear++;
		arr[rear]=n;
	}
	T deQueue() {
		T element;
	    if (isEmpty()) {
	      System.out.println("Queue is in Underflow condition");
	      return null;
	    } else {
	      element = arr[front];
	      if (front >= rear) {
	        front = -1;
	        rear = -1;
	      } // Q has one element, so we reset the queue after deleting.
	      else {
	        front++;
	      }
	      return (element);
	    }
	  }
	void display() {
		 if (isEmpty()) {
		      System.out.println("Queue is in underflow condition");
		    } 
		 else {
		      System.out.println("\nThe Queue view in FIFO order: ");
		      for (int i = front; i <= rear; i++)
		        System.out.print(arr[i] + "  ");
		    }
	}
	
}
public class Prblm2 {

	public static void main(String[] args) {
		Queue <Integer> q1=new Queue<Integer>(5);
		q1.Enqueue(20);
		q1.Enqueue(80);
		q1.Enqueue(30);
		q1.Enqueue(60);
		q1.Enqueue(10);
		q1.display();
		q1.deQueue();
		q1.deQueue();
		q1.deQueue();
		q1.display();
		q1.deQueue();
		q1.deQueue();
		q1.deQueue();

	}

}

/*
 * The Queue view in FIFO order: 
20  80  30  60  10  
The Queue view in FIFO order: 
60  10  Queue is in Underflow condition
 */
