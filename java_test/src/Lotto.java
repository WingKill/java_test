
public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int len = arr.length;
		for(int i = 0; i< len ; i++){
			arr[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}				
			}	
		}		
		
		for(int i = 0; i< len ; i++) {
			if(i == len-1)
				System.out.print("bonus number : ");
			System.out.print(arr[i] + " ");
		}
	}

}
