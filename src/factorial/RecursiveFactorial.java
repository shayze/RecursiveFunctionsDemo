package factorial;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter A Number To Calculate Its Factorial : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		System.out.println("the factorial of the number : " + input  + "\t Is : "+ factorial(number));
	}

	public static int factorial (int n ) {
		if (n == 1 || n == 0 ) {
			return 1;
		}
		return n * factorial(n-1);
		
	}
}
