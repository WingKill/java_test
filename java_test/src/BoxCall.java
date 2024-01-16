
public class BoxCall {
	public static void main(String[] args) {
		
		

		Box1[] ar = new Box1[3];
		
		System.out.println(ar);
		ar[0] = new Box1("First");
		ar[1] = new Box1("Second");
		ar[2] = new Box1("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		String[] sr = new String[7];
		
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");

		// 배열 내 문자열의 모든 문자 개수를 담는 변수
		int cnum = 0;
		
		for(int i = 0; i< sr.length ; i++) {
			// 각 객체 내 String 변수의 길이를 다 더하는 작업
			cnum += sr[i].length();
		}
		
		System.out.println("해당 배열의 총 문자 수 : " + cnum);
	}
}
