package collection_framework_progs;

import java.util.ArrayList;
import java.util.Collections;

/*Write a program that inputs the names of people into different array list, A and B. Array A has N
number of names while array B has M number of names, with no duplicates in either of them. Merge
arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
Display all the three arrays list, A, B and C, stored alphabetically.*/
public class Problem3 {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
        A.add("AAA");
        A.add("GGG");
        A.add("CCC");
        
        ArrayList<String> B = new ArrayList<String>();
        A.add("XXX");
        A.add("YYY");
        A.add("BBB");
        ArrayList<String> C = new ArrayList<String>();
        C.addAll(A);
        C.addAll(B);
        Collections.sort(C);   
        System.out.println(C);
        
        
        

	}

}


/*
[AAA, BBB, CCC, GGG, XXX, YYY]

*/