import java.util.Scanner;

public class PointNumber {

	public static void main(String[] args) {
		// 컴퓨터, 인간의 1:1
		// 컴퓨터는 랜덤값, 인간은 입력값
		// 비교 연산
		// 게임 시작 및 종료 입력.
		// while 문은 메인 함수가 있는 곳에 선언
		Scanner sc = new Scanner(System.in);
		int sc1 = 1;
		while(sc1 == 1) {
			System.out.println("게임시작 1");
			System.out.println("게임종료 2");
			sc1 = sc.nextInt();
			if(sc1 != 1) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			Player com = new Player();
			System.out.print("숫자를 입력해 주세요 : ");
			// 입력
			Player player = new Player(sc.nextInt());
			// 반복 연산
			com.Player(player);
		}
	}
}
