class A1{
	int a;
	public A1() {
		// System.out.println("A1 생성");
	}
	
	public void funA1() {
		System.out.println("A1이 가지는 기능입니다");
	}
}

class B1 extends A1{
	public void funB1() {
		System.out.println("B1이 가지는 기능입니다");
	}
}

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
		
 		// 해당 인덱스들엔 생성된 A객체의 첫번째 주소값이 담길 수 있다.
		/* 위 배열은 해당 과정을 자동으로 진행한다고 보면 된다. 
		 * arr[0] = new A(); arr[1] = new A(); arr[2] = new A(); arr[3] = new A();
		 * arr[4] = new A();
		 */
		
		// 출력문 
		for(int i = 0; i< arr.length ; i++) {
			arr[i] = new A();
			arr[i].setNum(i);
			System.out.println("arr[" + i + "] : " + arr[i].getNum());
		}
		
		// 상속 개념을 이해하기 위한 테스트 코딩(B1은 A1의 자식 클래스이다.)
		B1 b1 = new B1();
		System.out.println(b1.a);
		b1.a = 15;
		System.out.println(b1.a);
		b1.funA1();
		b1.funB1();
		
		// A1 a = new A1();
		// a.funA1();
		
		
	}

}
