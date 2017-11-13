package strcopies;

import java.util.Scanner;

public class StrCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner strSc = new Scanner (System.in);
		Scanner subSc = new Scanner (System.in);
		Scanner numSc = new Scanner (System.in);
		
		System.out.println("PLEASE ENTER A STRING: ");
		String str = strSc.nextLine();
		
		System.out.println("PLEASE ENTER A SUBSTRING: ");
		String sub = subSc.nextLine();
		
		System.out.println("PLEASE ENTER A NUMBER OF APPEARENCES: ");
		String num = numSc.nextLine();
		int n = Integer.parseInt(num);
		if(strCopies(str, sub, n)) {
			System.out.println("THE SUBSTRING " + sub + " DOES APPEAR IN THE STRING " + str + " ; " + n + " TIMES");
		}else {
			System.out.println("THE SUBSTRING " + sub + " DOES APPEAR IN THE STRING " + str + " ; " + n + " TIMES");
		}
	}

	public static boolean strCopies(String str , String sub , int n ) {
		
		return helperFunction(str,sub)==n ? true : false ; 
	}

	private static int helperFunction(String str, String sub) {
		// TODO Auto-generated method stub
		int strLength = str.length() ; 
		int subLength = sub.length() ;
		if(strLength < subLength) return 0 ;
		if(str.substring(0,subLength).equals(sub)) 
			return 1 + helperFunction(str.substring(1), sub);
		return helperFunction(str.substring(1), sub);
	}
	
}
