package changepi;

import java.util.Scanner;

public class ChangePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string that has pi in it and we'll change it ");
		String input = sc.nextLine() ; 
		System.out.println("after change the string is: ");
		System.out.println(changePI(input));

		}
	public static String changePI(String str) {
		if(str.equals("") || str.length() < 2) return str ; 
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i')
			return " 3.14" + changePI(str.substring(2));
		return str.charAt(0) + changePI(str.substring(1));
	}

}
