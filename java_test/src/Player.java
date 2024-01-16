import java.util.Scanner;

class Player {
	
	private int num; 
	private int count = 10;
	private int remainCount = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Player() {
		this.num = (int)((Math.random()*50) + 1);
	}
	
	public Player(int num) {
		this.num = num;
	}
	
	public int setNum(int num) {
		return this.num = num;
	}
	
	public void Player(Player player) {
		while(count > 0 ) {
			if(this.num > player.num) {
				count--;
				System.out.println("Up ===> " + count + "번 남아 있습니다.");
				System.out.print("숫자를 입력해 주세요 : ");
				player.setNum(sc.nextInt());	
				this.Player(player);
			}else if(this.num < player.num) {
				count--;
				System.out.println("Down ===> " + count + "번 남아 있습니다.");
				System.out.print("숫자를 입력해 주세요 : ");
				player.setNum(sc.nextInt());
				this.Player(player);
			}else{
				remainCount = count;
				count = 0;
				System.out.println("일치");
				break;
			}
		}
		if(count == 0 && remainCount == count) {
			System.out.println("횟수를 다 사용했습니다.");
			return;
		}
	}
}
