package collection_framework_progs;

import java.util.StringTokenizer;
import java.util.TreeSet;

/*Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
printed in ascending sorted order.*/
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mydel = " : ";
        String mystr = "JAVA : AAA : Name : MYprogs : ram";

        StringTokenizer str = new StringTokenizer(mystr, mydel);
        int count = str.countTokens();
        TreeSet<String> tree = new TreeSet<String>();
        for(int i=0;i<count;i++)
        	tree.add(str.nextToken());
        tree.descendingSet();
        System.out.println("TreeSet: " + tree); 
        
	}

}
/*
TreeSet: [AAA, JAVA, MYprogs, Name, ram]

*/