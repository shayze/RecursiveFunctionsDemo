package bunnyears;

import java.util.Scanner;

public class BunnyEars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number of bunnies : ");
		int bunnies = sc.nextInt() ; 
		System.out.println("they have " +bunnyEars(bunnies) + " Ears");
	}

	public static int bunnyEars(int bunnies) { 
		return (bunnies == 0 ? 0 : 2 + bunnyEars(bunnies-1));
	}
}
