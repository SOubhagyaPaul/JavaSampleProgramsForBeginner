package day1;
import java.util.Scanner;
/*An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting is done by marking the 
candidate number on the ballot paper. Write a program to read the ballots and count the votes casts for each candidate using an array variable count.
 In case, a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’ and the program should also count the number of spoilt ballot.*/

public class prblm8_2{

	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("******Enter 1 to 5 whome you want to vote for.*******");
		System.out.println("******Enter 0 to close voting. ******");
		int spoiltballot=0;
		int count[]=new int[5];
		while(true){
			System.out.println("Enter your vote: ");
			int vote=sc.nextInt();
			if(vote>=1 && vote<=5){
				count[vote-1]++;
			}
			else if(vote==0)
				break;
			else
				spoiltballot++;
		}
		System.out.println("Vote counts for each candidate:");
        	for (int i = 0; i < count.length; i++) {
            		System.out.println("Candidate " + (i + 1) + ": " + count[i] + " votes");
        	}

        	System.out.println("Spoiled ballots: " + spoiltballot);
						

	}

}


/*
******Enter 1 to 5 whome you want to vote for.*******
******Enter 0 to close voting. ******
Enter your vote: 
3
Enter your vote: 
4
Enter your vote: 
4
Enter your vote: 
5
Enter your vote: 
-1
Enter your vote: 
9
Enter your vote: 
10
Enter your vote: 
4
Enter your vote: 
4
Enter your vote: 
3
Enter your vote: 
2
Enter your vote: 
2
Enter your vote: 
1
Enter your vote: 
0
Vote counts for each candidate:
Candidate 1: 1 votes
Candidate 2: 2 votes
Candidate 3: 2 votes
Candidate 4: 4 votes
Candidate 5: 1 votes
Spoiled ballots: 3


*/