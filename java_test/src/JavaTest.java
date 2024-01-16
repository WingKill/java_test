class A{
	private int num = 0;
	public A() {
		
	}
	
	public int setNum(int num) {
		return this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}


public class JavaTest {

	public static void main(String[] args) {
		A[] arr = new A[5];
		System.out.println(arr.length);
		
		// 해당 인덱스들엔 A 객체의 첫번째 주소값이 담길 수 있다.
//		arr[0] = new A();
//		arr[1] = new A();
//		arr[2] = new A();
//		arr[3] = new A();
//		arr[4] = new A();
		
		for(int i = 0; i< arr.length ; i++) {
			arr[i] = new A();
			arr[i].setNum(i);
			System.out.println("arr[" + i + "]("+arr[i]+")" +  ":" + arr[i].getNum());
		}
		

	}

}
