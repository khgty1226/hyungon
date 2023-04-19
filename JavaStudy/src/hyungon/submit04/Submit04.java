package hyungon.submit04;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
		
		System.out.println("\n======================== 문제1 =========================\n");
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		String backwardInput = "";
		
		System.out.println("문자열을 입력하시오 !");
		System.out.println(">>>");
		
		input = scan.nextLine();
		
		for (int i = input.length(); i > 0 ; i--) {
			backwardInput += input.substring(i-1 ,i); 
		}
		
		System.out.println(backwardInput);
		
		
		System.out.println("\n======================== 문제2 =========================\n");
		
		int elevatorA = 4;
		int elevatorB = 4;
		int myFloor ;
		
		Scanner floor = new Scanner(System.in);
		
		
		while(true){
			
			System.out.println("====================== 희영빌딩 엘리베이터 =====================");
			System.out.println("승강기 A의 현재 위치 : " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치 : " + elevatorB + "층");
			System.out.print("몇 층에 계시나요? [종료하시려면 q 또는 exit 입력] : ");
			
			String temp = floor.nextLine(); // 이용자의 층 입력
			
			// 입력 값이 q 또는 exit 인지 확인하여
			// 종료 or 진행 결정
			
			// 종료
			if(temp.equals("q") || temp.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			// 진행
			myFloor = Integer.parseInt(temp);
			System.out.println(myFloor + "층에서 엘리베이터를 호출합니다.");
			
			// 두 엘리베이터와 이용자와의 거리 계산
			int diffA = Math.abs(elevatorA - myFloor);
			int diffB = Math.abs(elevatorB - myFloor);
			
			// 승강기가 있는 위치에서 호출 할 때  
			if (diffA == 0) {
				System.out.println("해당 위치에 승강기 A가 있습니다.");
				continue;
			}else if(diffB == 0) {
				System.out.println("해당 위치에 승강기 B가 있습니다.");
				continue;
			}
			
			// A와 B 중 가까운 거리의 엘리베이터 호출
			if (diffA > diffB) {  // B 엘리베이터 호출
				elevatorB = myFloor ;
				System.out.println("승강기 B가 " + elevatorB + "층으로 이동하였습니다.");
			} 
			else if(diffB > diffA) {  // A 엘리베이터 호출
				elevatorA = myFloor ;
				System.out.println("승강기 A가 " + elevatorA + "층으로 이동하였습니다.");
			} 
			// 두 엘리베이터와의 거리가 같다면 이용자보다 높은 층의 엘리베이터 호출
			else if(diffA == diffB) {  
				if(elevatorA > elevatorB) {
					elevatorA = myFloor ;
					System.out.println("승강기 A가 " + elevatorA + "층으로 이동하였습니다.");
				}else if(elevatorB > elevatorA) {
					elevatorB = myFloor ;
					System.out.println("승강기 B가 " + elevatorB + "층으로 이동하였습니다.");
				}
				// 두 엘리베이터가 같은 층에 있다면 1/2 확률로 랜덤 호출
				else {  
					if((int)(Math.random() * 2 + 1) % 2 == 0) {
						elevatorA = myFloor ;
						System.out.println("승강기 A가 " + elevatorA + "층으로 이동하였습니다.");
					}else if((int)(Math.random() * 2 + 1) % 2 == 1) {
						elevatorB = myFloor ;
						System.out.println("승강기 B가 " + elevatorB + "층으로 이동하였습니다.");
					}
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
