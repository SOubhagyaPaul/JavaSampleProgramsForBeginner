package lambdaProgs;
/*
 * Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
calculator perform Addition, Subtraction, Division, Multiplication operation.
 */
interface calculate{
	double operation(double a, double b);
}
public class Prblm6 {

	public static void main(String[] args) {
		calculate addition=(n1,n2)->n1+n2;
		System.out.println(addition.operation(12, 1.6));
		
		calculate subtraction=(n1,n2)->n1-n2;
		System.out.println(subtraction.operation(12, 1.6));
		
		calculate div=(n1,n2)->n1/n2;
		System.out.println(div.operation(12, 6));
		
		calculate mul=(n1,n2)->n1*n2;
		System.out.println(mul.operation(12, 6));

	}
}

/*
 * 13.6
10.4
2.0
72.0
 * 
 * 
 */
