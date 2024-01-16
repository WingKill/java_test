
public class Multiples {
	public static void main(String[] args) {
		int[] multi = new int[100];
		for(int i = 0; i<multi.length; i++) {
			multi[i] = (int)(Math.random()*100 + 1);
			if(multi[i] % 3 == 0) {
				System.out.println(multi[i]);
			}
		}
	}
}
