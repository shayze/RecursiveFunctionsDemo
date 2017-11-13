package count7;

public class Count7RecursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(count7(77642377));
	}

	public static int count7(int n) {
		
		if(n < 1) return 0 ;
		if(n%10 == 7) return 1 + count7(n/10);		
		else return count7(n/10);
	}
}
