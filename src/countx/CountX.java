package countx;

public class CountX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countX("xyyxxlxhxkxyxlxixtx"));
	}
	
	public static int countX(String str) {
		if(str.equals("")) return 0 ;
		if (str.charAt(0) == 'x') return 1 + countX(str.substring(1))	;
		else return countX(str.substring(1));
	}

}
