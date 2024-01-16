
public class ClassMethod {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int sum = sumOfAry(ar);
		
		System.out.println(sum);
		
		int[] arrInt = {1,2,3};
		
//		String[] arrString = {"홍길동","홍길순","홍말똥"};
		String[] arrString = {
				new String("홍길동"),
				new String("홍길순"),
				new String("홍말똥")};
		for(int i = 0; i< arrString.length ; i++)
			System.out.println(arrString[i]);
		
	}
	
	static int sumOfAry(int[] arrInt) {
		int sum = 0;
		for(int i = 0; i< arrInt.length ; i++) {
			sum += arrInt[i];
		}
		return sum;
	}

}
