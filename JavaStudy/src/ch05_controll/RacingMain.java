package ch05_controll;

public class RacingMain {

	public static void main(String[] args) {

		String lane1 = "";
		String lane2 = "";
		String lane3 = "";
		String lane4 = "";
		String lane5 = "";
		String lane6 = "";
		
		while(true) {
			// 확률에 따른 전진
			// Math.random()은 0~1사이에 랜덤 소수 리턴
			// random에 0~7중 랜덤한 숫자가 담긴다
			int random = (int)(Math.random() * 8);
			
			// 1/8 확률
			if(random == 1) {
				lane1 += "=";
			}else if(random == 2) {
				lane2 += "=";
			}else if(random == 3) {
				lane3 += "=";
			}else if(random == 4) {
				lane4 += "=";
			}else if(random == 5) {
				lane5 += "=";
			}else if(random == 6) {
				lane6 += "=";
			}
			
			for(int i = 0 ; i < 20 ;i++) {
				System.out.println();
			}
			
			
			System.out.println("1. " + lane1+ "🐎");
			System.out.println("2. " + lane2+ "🐎");
			System.out.println("3. " + lane3+ "🐎");
			System.out.println("4. " + lane4+ "🐎");
			System.out.println("5. " + lane5+ "🐎");
			System.out.println("6. " + lane6+ "🐎");
			
			if(lane1.length() == 20) {
				System.out.println("1번 승리!");
				break;
			}else if(lane2.length() == 40) {
				System.out.println("2번 승리!");
				break;
			}else if(lane3.length() == 40) {
				System.out.println("3번 승리!");
				break;
			}else if(lane4.length() == 40) {
				System.out.println("4번 승리!");
				break;
			}else if(lane5.length() == 40) {
				System.out.println("5번 승리!");
				break;
			}else if(lane6.length() == 40) {
				System.out.println("6번 승리!");
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
