package countabc;

import java.util.Scanner;

public class CountABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string that and well cound how many times abc or aba are happenning ");
		String input = sc.nextLine() ; 
		System.out.println("number of ocurrences : ");
		System.out.println(countABC(input));
		
	}
//will count the number of appearences of 'abc' or 'aba'
	public static int countABC(String str) {
		if (str.length() < 3) return 0 ;
		if(str.charAt(0)== 'a' && str.charAt(1)=='b' && ( str.charAt(2) =='c' || str.charAt(2) == 'a' ))
			return 1 + countABC(str.substring(2));
		return countABC(str.substring(1));
	}
}
