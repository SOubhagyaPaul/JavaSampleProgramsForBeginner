package collection_framework_progs;
/*Write a program to find elements which are present in first array and not in second array.*/

import java.util.ArrayList;
import java.util.HashSet;

public class Problem5 {

	public static void main(String[] args) {
		int arr1[] ={ 11, 3, 7, 1, 55, 12, 33, 99, 8 };
        int arr2[] =  { 11, 7, 5,99,8 };
        HashSet<Integer> hset = new HashSet<Integer>();
        ArrayList<Integer>res=new ArrayList<Integer>();
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < n; i++) {
            if (!hset.contains(arr2[i]))
                hset.add(arr2[i]);
        }
        for(int i=0;i<m;i++) {
        	if(!hset.contains(arr1[i])) {
        		res.add(arr1[i]);
        	}
        }
        System.out.println(res);
	
	}
}


/*
[3, 1, 55, 12, 33]
*/