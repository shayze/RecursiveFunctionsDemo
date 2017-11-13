package array11;

public class Array11 {
public static final int index = 0  ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[] { 1, 4 , 22 , 65 , 12 , 63411, 11, 234661, 1,11, 1111, 11};
		
		System.out.println("THE ARRAY IS : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" , " + intArray[i]);	
		}

		System.out.println("\nTHE TIMES 11 APPEARS IN THE ARRAY ARE : " + array11(intArray , index) + ", TIMES");
	}
	

	public static int array11(int[] arr , int index) {

		if ( index >= arr.length ) return 0 ; 
		if ( arr[ index ] == 11 ) return 1 + array11(arr , index + 1) ; 
		else return array11(arr , index + 1);
	}
}
