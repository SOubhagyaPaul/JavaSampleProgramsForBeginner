package day4;
/*
 * Write a method (not the entire application) called CountVowels, which takes the input
arguments as character and checks whether it is a vowel; increment the instance variable
called vCnt by 1.
 */

public class Prblm6 {
	static int vCnt=0;
	static void CountVowels(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
			vCnt++;
		}
	}
	public static void main(String[] args) {
		String s="my name is soubhagya";
		for(int i=0;i<s.length();i++) {
			CountVowels(s.charAt(i));
		}
		System.out.println("The count of the vowels: "+vCnt);

	}
	
}
/*
The count of the vowels: 7
*/