package parentbits;

import java.util.Scanner;

public class ParentBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string and output the string inside the parenthesses");
		String str = sc.nextLine() ; 
		
		System.out.println("the string inside the parenthesses is : ");
		System.out.println(parentBits(str));
	}
	
	
//will output the string inside parentheses
	public static String parentBits(String str) {
		if(str.equals(""))return str ;
		if(str.charAt(0)=='(') {
			if(str.charAt(str.length()-1) == ')')return str; 
			else
				return parentBits(str.substring(0, str.length()-1));	
		}
		return parentBits(str.substring(1));
	}
}
