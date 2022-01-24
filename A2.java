import java.io.IOException;
import java.util.Scanner;

public class A2 {
	/**
	 * 
	 * @param args pass a variable number of arguments to a function 
	 * @throws IOException used to declare exceptions that occur during the execution program
	 */

	public static void main(String[] args) throws IOException  {
		
		//declare a scanner object and variable for user input 
		
		int userInput =-1;
		
		Scanner In = new Scanner(System.in);
		
		// while loop for menu display 
		
		do {
			System.out.println("Choose from the following options:");
			System.out.println("1.Recursive Fibonacci");
			System.out.println("2.Iterative Fibonacci");
			System.out.println("3.Recursive Factorial");
			System.out.println("4.Iterative Factorial");
			System.out.println(">>");
			userInput =In.nextInt();
		}
		while (userInput>4|| userInput <0);
		
		//prompt user for n-th input 
		
		System.out.println("Enter n-th term:");
		int nthInput =In.nextInt();
		
		//switch statement for different user choices 
		
		// each case should call a separate function 
		
		switch (userInput) {
		
		case 1 :
			System.out.println(A1Static.recursiveFib(nthInput));
			break;
		case 2:
			System.out.println(A1Static.iterativeFib(nthInput));
			break;
			
		case 3:
		
		   System.out.println(A1Static.recursiveFact(nthInput));
		   
		   break ;
		   
		case 4:
			System.out.println(A1Static.iterativeFact(nthInput));
			break;
		}
	}
}


			
			
	
