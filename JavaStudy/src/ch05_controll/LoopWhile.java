package ch05_controll;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// while 문
		
		
		for(int i = 1; i<= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i = 1;
		while(i < 11) {
			System.out.println(i);
			i++;
		}
		
		//while문으로 구구단 2단 작성
		
		i = 1;
		while(i<10) {
			System.out.println("2 x "+ i + " = " + (i*2));
			i++;
		}
		
		// 서로 같은 반복문이지만
		// while 문은 반복횟수가 정해지지 않은 경우 사용
		// for문은 반복횟수가 딱 정해져 있을 때 사용
		
		System.out.println("\n==============================\n");
		
		Scanner scan = new Scanner(System.in);
		boolean isRun = false;
		
		while(isRun) {
			System.out.println("이름 입력 [종료는 q 또는 Q]");
			System.out.print(">>>");
			
			String input = scan.nextLine();
			
			if(input.equals("q") || input.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
			}else {
				System.out.println(input + "님 환영합니다.");
			}
		}
		
		// break 문 사용
		
//		while (true) {
//			System.out.println("이름 입력 [종료는 q 또는 Q]");
//			System.out.print(">>>");
//			
//			String input = scan.nextLine();
//			
//			if(input.equals("q") || input.equals("Q")) {
//				// eqaulsIgnoreCas ("q")  : 대소문자 구분 없이
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println(input + "님 환영합니다.");
//			}
//		}
		
		System.out.println("\n=============================\n");

		// do-while 문
		isRun = false;
		
		// 반복해야 할 내용이 최소 한 번은 실행되게끔 하고싶을 때
		// (굳이 몰라도 됨)
		
		do {
			// 반복될 내용
			System.out.println("하이");
		}while (isRun);
		
		
		System.out.println("\n==================================\n");
		
		// while 문 또한 다중 사용 가능
		// while 문으로 구구단
		
		int left = 1;
		int right = 1;
		
		while(left < 10) {
			while(right < 10) {
				System.out.println(left + " x " + right + " = " + (left*right));
				right++;
			}
			left ++;
			right = 1;
		}
		
		
		// 피카츄 게임
		
		int enemyHp = 100;
		
		outer : while(true) {   // while문에 'outer'라는 닉네임 지정
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 공격 ||  2. 도망");
			System.out.println(">>>");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command ==1 ) {
				// TODO 공격
				while(true) {
					System.out.println("공격 방법 선택");
					System.out.println("1. 백만볼트 || 2. 전광석화 || 3.취소");
					System.out.println(">>>");
					
					int select = Integer.parseInt(scan.nextLine());
					
					if (select == 1) {
						System.out.println("피~~카~~~~~~츄!!!");
						enemyHp -= 20;
					} else if(select == 2) {
						System.out.println("삐까삐까");
						enemyHp -= 10;
					} else if(select == 3) {
						System.out.println("공격 취소 !"); 
						break;
					}
					
					System.out.println("파이리의 현재 체력은 :"+ enemyHp);
					
					if(enemyHp <= 0) {
						System.out.println("파이리를 잡았다.");
//						System.exit(0);
						break outer;
						// 내부에서 외부 while문 중지
						
					}
					
				}
			}
			else if (command == 2) {
				// 도망
				System.out.println("도망쳤습니다.");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
