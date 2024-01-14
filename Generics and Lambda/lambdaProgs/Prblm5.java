package lambdaProgs;
/*
 * Write the following methods that return a lambda expression performing a specified action:
isOdd(): The lambda expression must return true if a number is odd or false if it is even.
isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
 */
interface A{
	boolean test(int n);
}

public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A isOdd=(n)->(n%2)!=0;
		System.out.println("Number is odd or even: "+isOdd.test(11));
		System.out.println("Number is odd or even: "+isOdd.test(14));
		
		A isPrime=(n)->{
			if(n<=0)
				return false;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					return false;
			}
			return true;
		};
		System.out.println("Number is prime or not :"+isPrime.test(14));
		System.out.println("Number is prime or not :"+isPrime.test(17));
		
		A isPalindrome=(n)->{
			int temp=n;
			int rev=0;
			while(n > 0)
			{
				rev = rev * 10 + n % 10;
				n = n / 10;
			}
			if(rev == temp)
				return true;
			return false;
		};
		System.out.println("Number is palindrome or not: "+isPalindrome.test(141));
		System.out.println("Number is palindrome or not: "+isPalindrome.test(1419));
	}

}

/*
Number is odd or even: true
Number is odd or even: false
Number is prime or not :false
Number is prime or not :true
Number is palindrome or not: true
Number is palindrome or not: false



*/