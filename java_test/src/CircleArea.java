// import java.util.Scanner;

public class CircleArea {

	private static double sumofCircle(Circle5[] arrCircle) {
		double areaSum = 0;
		for(int i = 0 ; i< arrCircle.length ; i++) {			
			areaSum += arrCircle[i].getArea();
		}
		return areaSum;
	}
	
	public static void main(String[] args) {	
		// 주로 소스 코드 수정을 위해 final 변수를 둔다.
		Circle5[] arrCircle = {new Circle5(5),new Circle5(10),new Circle5(100)};
		double circleSum = sumofCircle(arrCircle);
		System.out.println(circleSum);
		
		int[] arr = new int[10];
		for(int i = 0; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		String[] strArr = new String[10];
		for(int i = 0; i< strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
//		final int CIRCLE_MAX = 3;
//		
//		Circle5[] arrCircle = new Circle5[CIRCLE_MAX];
//		
////		arrCircle[0] = new Circle5(5);
////		arrCircle[1] = new Circle5(10);
////		arrCircle[2] = new Circle5(100);
//		
//		// 반지름을 키보드로 입력받기.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		double areaSum = 0 ;
//		
//		for(int i = 0;i<arrCircle.length;i++) {
//			System.out.println("반지름을 입력하십시오.");
//			double radius = sc.nextDouble();
//			arrCircle[i] = new Circle5(radius);
//			areaSum += arrCircle[i].getArea();
//		}
//		
//		System.out.println("배열 내 모든 원들의 넓이의 합 : "+areaSum);
//		
//		// 
	}
}
