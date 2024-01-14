package genricProgs;

import java.util.Collection;

//Write a Generic Method that can perform the sorting of any type of data
class GenSort<T extends Comparable<T>>{
//	T arr[];
//	int size;
//	@SuppressWarnings("unchecked")
//	GenSort(int size){
//		this.size=size;
//		arr=(T[])new Object[size];
//	}
	void sorting(T a[]) {
		boolean flag=false;
		do {
			flag=true;
			for(int i=0;i<a.length-1;i++) {
				if(a[i].compareTo(a[i+1])>0) {
					T temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=false;
				}
			}
		}while(!flag);
		System.out.println("The sorted array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(" "+a[i]);
		}
	}
}
public class Prblm3 {

	public static void main(String[] args) {
		
		GenSort <Integer> ob1=new GenSort<Integer>();
		Integer arr[]= {2,5,22,8,1,-5};
		ob1.sorting(arr);
		
	}
}

/*
 * The sorted array is : 
 -5
 1
 2
 5
 8
 22

 * 
 */
