package day4;
/*
 * Write a program to determine if a string has all Unique Characters.[remove white space]
Given a string, determine if the string has all unique characters.
Examples :
Input: ab cd 10jk
Output: true
Input: hutg9mnd!nk9
Output: false
 */

public class Prblm7 {
	static boolean uniqueChar(String s)
    {
       
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j))
                    return false;
 
        return true;
    }
	public static void main(String[] args) {
		String s1 = "ab cd 10jk";
		String op1 = s1.replace(" ","");
		boolean result1=uniqueChar(op1);
        System.out.println(" String has unique Characters: "+result1);
		String s2 = "hutg9mnd!nk9";
        String op2 = s2.replace(" ","");
        boolean result2=uniqueChar(op2);
        System.out.println(" String has unique Characters: "+result2);
	}

}


/*
 String has unique Characters: true
 String has unique Characters: false

 */