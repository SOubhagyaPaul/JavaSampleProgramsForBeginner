package collection_framework_progs;

import java.util.HashSet;

/*Write a program to find whether an array is subset of another array or not.*/
public class Problem4 {

	public static void main(String[] args) {
		int arr1[] = { 11, 7, 5 };
        int arr2[] = { 11, 3, 7, 1, 55, 12, 33, 99, 8 };
        HashSet<Integer> hset = new HashSet<Integer>();
        int m = arr1.length;
        int n = arr2.length;
        boolean flag=true;
        if(m>n) {
        	for (int i = 0; i < m; i++) {
                if (!hset.contains(arr1[i]))
                    hset.add(arr1[i]);
            }
        	for (int j = 0; j < n; j++) {
                if (!hset.contains(arr2[j])) {
                	flag=false;
                }
        	}
        	if(flag)
        		System.out.println("arr2 is a subset of arr1");
        	else
        		System.out.println("arr2 is not a subset of arr1");
        		
        }
        else {
        	for (int i = 0; i < n; i++) {
                if (!hset.contains(arr2[i]))
                    hset.add(arr2[i]);
            }
        	for (int i = 0; i < m; i++) {
                if (!hset.contains(arr1[i])) {
                	flag=false;
                }      
        	}
        	if(flag)
        		System.out.println("arr1 is a subset of arr2");
        	else
        		System.out.println("arr1 is not a subset of arr2");
       }
	}

}

/*
arr1 is not a subset of arr2

*/