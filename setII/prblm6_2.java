package day1;
import java.util.Scanner;
/*For a certain electrical circuit with an inductance L and resistance R, the damped natural
frequency is given by:
Frequency = √ [( 1 / LC ) – ( R2/4C2 )]
It is desired to study the variations of the frequency with C (capacitance). Write a program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps of 0.01. */

public class prblm6_2{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inductance value: ");
		double l=sc.nextDouble();
		System.out.println("Enter the resistance value: ");
		double r=sc.nextDouble();
		
		double startC=0.01;
		double endC=0.1;
		
		double freq;
		for(double i=startC;i<=endC;i=i+0.01){
			freq=Math.sqrt(1.0/(l*i)-(r*r)/(4.0*i*i));
			//System.out.println("The frequency of difference values of C starting 0.01 to 0.1 in steps of 0.01 : "+freq);
			System.out.printf("%.2f\t\t%.4f%n", i, freq);
		}		

	}



}

/*output:
 * 
 * Enter the inductance value: 
0.1
Enter the resistance value: 
0.01
0.01		31.6188
0.02		22.3593
0.03		18.2567
0.04		15.8109
0.05		14.1418
0.06		12.9097
0.07		11.9521
0.08		11.1802
0.09		10.5408
0.10		9.9999
*/
