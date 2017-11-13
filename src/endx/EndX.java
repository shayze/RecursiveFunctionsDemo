package endx;

import java.util.Scanner;

public class EndX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string and all the X's will be moved to the end of it");
		String str = sc.nextLine() ; 
		
		System.out.println("string after endX method : ");
		System.out.println(endX(str));
	}

	public static String endX(String str) {
		if(str.equals("") ) return str;
		if(str.charAt(0)=='x') return endX(str.substring(1)) + 'x';
		return str.charAt(0) + endX(str.substring(1)) ; 
	}
}
