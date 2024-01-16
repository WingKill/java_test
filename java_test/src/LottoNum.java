
public class LottoNum {

	public static void main(String[] args) {
		int[] x = new int[6];
		
		for(int i = 0; i< x.length ; i++) {
			x[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j<i; j++) {
				if(x[i] == x[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0; i< x.length ; i++) {
			System.out.print(x[i]+ " ");		
		}
	}

}
