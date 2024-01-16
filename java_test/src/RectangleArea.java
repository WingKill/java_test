import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] recArr = new Rectangle[3];
		int sum = 0;
		for(int i = 0; i< recArr.length ; i++) {
			System.out.println("배열 " + (i+1) + "번째의 가로, 세로 값을 입력하세요" );
			recArr[i] = new Rectangle(sc.nextDouble(),sc.nextDouble());
		}
		
		System.out.println("모든 사각형의 넓이의 합 : "+areaSum(recArr));		
	}
	
	public static double areaSum(Rectangle[] recArr) {
		double sum = 0;
		for(int i = 0; i< recArr.length ; i++) {
			sum = sum + recArr[i].getArea();
		}
		return sum;
	}
}
