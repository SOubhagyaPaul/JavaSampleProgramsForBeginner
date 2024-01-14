
package day4;
/*
 * Write a Java program to pass the string Have a nice day! from the command line, and
display each word in a new line. Use proper import statement for this program.
 */
public class Prblm1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++)  
			System.out.print(" "+args[i]);  

	}

}
/* input: Have a nice day!
 * output:Have a nice day! 
 */
