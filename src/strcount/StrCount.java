package strcount;

import java.util.Scanner;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner strSc = new Scanner(System.in);
		Scanner subSc = new Scanner(System.in);
		
		System.out.println("please enter a string and a substring and we'll check for the \n"
				+ "number of occurrences of that substring inside string ");
		String str = strSc.nextLine() ; 
		System.out.println("please enter a substring : ");
		String sub = subSc.nextLine() ; 
		System.out.println("number of occurrences : ");
		System.out.println(strCount(str,sub));
	}

	public static int strCount(String str , String sub) {
		
		int strLength = str.length() ; 
		int subLength = sub.length() ; 
		
		if(strLength < subLength) return 0 ; 
		if(str.substring(0 , subLength).equals(sub))
			return 1 + strCount(str.substring(subLength), sub);
	
		return strCount(str.substring(1) , sub);
	}
}
