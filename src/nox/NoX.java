package nox;

import java.util.Scanner;

public class NoX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner strSc = new Scanner(System.in);
		System.out.println("please enter a string and we'll remove all the X's out of it");
		String str = strSc.nextLine() ; 
		System.out.println("the string with out X's : " + noX(str));

	}

	public static String noX(String str) {
		
		if(str.equals("")) return  str ; 
		if(str.charAt(0) == 'x') return noX(str.substring(1));
		
		return str.charAt(0) + noX(str.substring(1)); 
			
		}
}
