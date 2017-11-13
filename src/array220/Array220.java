package array220;

public class Array220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0 ; 
		int[] intArray = new int[] { 2,22,150,1500 };
		
		System.out.println("THE ARRAY IS : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" , " + intArray[i]);	
		}
		System.out.println("\n");
		if(array220(intArray, index)) {
			System.out.println("YES THIS IS A 220 ARRAY");
		}else {
		System.out.println("N0 THIS IS NOT A 220 ARRAY ");
		}
	}

	public static boolean array220(int[] numbers , int index) {
	int len = numbers.length ; 

	if(index >= len-1) return false ; 
	if(numbers[index + 1] == numbers[index]*10) return true ; 
	return array220(numbers, index+1);
	}	
}
