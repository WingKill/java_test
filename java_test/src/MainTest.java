
public class MainTest {
	public static void main(String[] args) {
		int[][] arr1 = new int[4][4];
		int num = 1;
		for(int i = 0; i< arr1.length ; i++) {
			for(int j = 0; j< arr1[i].length ; j++) {
//				arr1[i][j] = num;
//				System.out.print(arr1[i][j] + " ");
//				num++;				
				arr1[i][j] = num++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		num = arr1.length * arr1[0].length ;
		for(int i = arr1.length - 1; i >= 0  ; i--) {
			for(int j = arr1[i].length - 1; j >= 0 ; j--) {
//				arr1[i][j] = num;
//				System.out.print(arr1[i][j] + " ");
//				num++;		
				arr1[i][j] = num--;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		String[][] arr2 = new String[3][3];
		for(int i = 0; i< arr2.length ; i++) {
			for(int j = 0; j< arr2[i].length ; j++) {
				arr2[i][j] = "(" + i + "," + j + ")" ;
				System.out.print(arr2[i][j]);
			}				
			System.out.println();
		}	
		
		int[][] arr = new int[3][3];
		for(int i = 0; i< arr.length ; i++) {
			for(int j = 0; j< arr[i].length ; j++) {
				System.out.print("("+i+","+j+")");
			}				
			System.out.println();
		}
		
//		int[][] arr = {
//				{11},
//				{22,33},
//				{44,55,66}
//		};
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}		
		
//		// 2행 2열의 배열을 만들라는 의미
//		int[][] arr2 = new int[2][2];
//
//		System.out.println("값 : " + arr2[0][0]);
//		
//		arr2[0][0] = 0;
//		arr2[0][1] = 1;
//		arr2[1][0] = 2;
//		arr2[1][1] = 4;
//		
//		int num = 0 ;
//		
//		for(int i = 0; i < 2 ; i++) {
//			for(int j = 0 ; j < 2; j++) {
//				num++;
//				arr2[i][j] = 0;
//				arr2[i][j] += num; // arr2[i][j] = arr2[i][j] + num;
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}		
		
		
//		Box[] ar = new Box[5];
//		ar[0] = new Box(101, "Coffee");
//		ar[1] = new Box(202, "Computer");
//		ar[2] = new Box(303, "Apple");
//		ar[3] = new Box(404, "Dress");
//		ar[4] = new Box(505, "Fairy-tale book");
//		
//		   // 배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
//		for(Box e: ar) {
//		   if(e.getBoxNum() == 505)
//		      System.out.println(e);
//		}
//		int sum = 0;
//		
//		int[] ar = {1,2,3,4,5};
//		// 기존  for문
////		for(int i = 0; i< ar.length; i++)
////			System.out.println(ar[i]);
//		
//		// enhanced for문
//		for(int i : ar) {
//			sum += i;
//			System.out.print(i + " ");
//		}
//		System.out.println("\n"+sum);
	}
}

