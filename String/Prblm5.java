package day4;
/*
 * Write a Java class called ArrayExample to declare an array of String objects called
Products of the size 10, assign values to each element while declarations and print and
sort them.
 */

class ArrayExample{
	
	String[] products= {"a","b","c","o","w","d","l","t"};
	void display() {
		for(int i=0;i<products.length;i++) {
			System.out.print("\t"+products[i]);
		}
		System.out.println();
		
	}

    void bubbleSort()
    {
        int i, j;
        String temp;
        boolean swapped;
        for (i = 0; i < products.length ; i++) {
            swapped = false;		//this is for if the array is already sorted loop will execute once complexity will be n
            for (j = 0; j < products.length- 1; j++) {
                if (products[j].compareTo(products[j+1]) > 0) {
                    
                    temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
	
	
	
    }
}

public class Prblm5 {

	public static void main(String[] args) {
		ArrayExample obj=new ArrayExample();
		System.out.println("The array of String is: ");
		obj.display();
		obj.bubbleSort();
		System.out.println("The sorted array of String is: ");
		obj.display();

	}
}

/*
 * The array of String is: 
	a	b	c	o	w	d	l	t
The sorted array of String is: 
	a	b	c	d	l	o	t	w

 */

