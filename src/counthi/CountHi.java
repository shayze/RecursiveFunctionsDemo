package counthi;

import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string that and we'll count how many times hi appears ");
		System.out.println("if there the letter x is in from if i it will not be counted");
		String input = sc.nextLine() ; 
		System.out.println("number of ocurrences : ");
		System.out.println(countHi(input));
	}

	public static int countHi(String str) { 
		if (str.length() < 2) return 0 ;
		if(str.charAt(0)== 'h' && str.charAt(1)=='i')
			return 1 + countHi(str.substring(2));
		if(str.charAt(0)== 'x' && str.charAt(1)=='h' && str.charAt(2) == 'i')
			return countHi(str.substring(2));
		return countHi(str.substring(1));
	}
}
