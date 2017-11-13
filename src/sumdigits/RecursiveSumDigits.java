package sumdigits;

import java.util.Scanner;

public class RecursiveSumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter A Number To Calculate The Sum Of Its Digits: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		System.out.println("the factorial of the number : " + input  + "\t Is : "+ sumDigits(number));
	
	}
	
	public static int sumDigits(int n) {
		return (n==0 ? 0 : n%10 + sumDigits(n/10));
	}

}
