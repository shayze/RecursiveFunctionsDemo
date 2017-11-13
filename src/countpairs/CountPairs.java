package countpairs;

import java.util.Scanner;

public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME WE WILL COUNT THE NUMBER OF PAIRS IN A STRING");
		System.out.println("A PAIR IS TWO INSTANCES OF A CHAR SEPERATED BY ANOTHER CHAR");
		System.out.println("please enter a string:");
		String str = sc.nextLine(); 
		System.out.println("the number of pairs in the string is :");
		System.out.println(countPairs(str));
	}

	public static int countPairs(String str) {
		if (str.equals("") || str.length() < 3)return 0 ;
		if (str.charAt(0) == str.charAt(2))
			return 1 + countPairs(str.substring(1));
		return countPairs(str.substring(1));
	}
}
