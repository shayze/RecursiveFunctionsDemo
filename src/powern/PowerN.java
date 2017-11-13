package powern;

import java.util.Scanner;

public class PowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scBase = new Scanner(System.in);
		Scanner scPower = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE POWER CALCULATOR!!!");
		
		
		System.out.println("Please Enter A Number To Preform As Base : ");
		String baseString = scBase.nextLine();
		System.out.println("Please Enter A Number To Preform As The N'th Power Degree : ");
		String powerString = scPower.nextLine();
		
		int base = Integer.parseInt(baseString);
		int power = Integer.parseInt(powerString);
		
		System.out.println( "Well... " +  base + " to the power of : " + power  + "\t Is : "+ powerN(base,power));
	}

	public static int powerN(int base , int n) {
//		if(n==0) 
//			return 1; 
//		return(base * powerN(base , n-1));
		return (n==0) ? 1 : base * powerN(base , n-1); 
	}

}
