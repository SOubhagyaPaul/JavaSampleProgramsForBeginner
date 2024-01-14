package day4;
/*
 *Write a Java class called CountAndPrintArgs to print the number of arguments passed on
the command-line as well as the 1st letter of the arguments. For example, if the command
line arguments are: “Mango Cucumber Apple” then the output will be
No. of arguments – 3 MCA
Write a main method to test the class.
 */
class CountAndPrintArgs{
	int len;
	void fstwrd(String s){
		
		System.out.print(s.charAt(0));
	}
	void displaylen(){
		System.out.println(" "+this.len);
	}
}
public class prblm2 {
	public static void main(String[] args) {
		CountAndPrintArgs obj= new CountAndPrintArgs();
		obj.len=args.length;
		obj.displaylen();
		for(int i=0;i<args.length;i++){
			obj.fstwrd(args[i]);
		}
	}

}

/*
 * input: Mango Cucumber Apple
 *  
 *  3
MCA
 */
