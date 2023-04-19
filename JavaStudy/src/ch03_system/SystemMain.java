package ch03_system;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {

// 1.  표준 출력
		// 콘솔창에 텍스트 출력하기
		
		// println()
		// 콘솔창에 괄호 안 내용을 출력 후, 알아서 줄 바꿈(개행문자) 처리
		System.out.println("이미 알고 있음");
		System.out.println();  // 줄 바꿈만 일어남
		System.out.println("end");
		
		// print()
		// 괄호 안 내용을 출력하기만 함
		System.out.print("줄바꿈 안 됨");
		System.out.print("보기에 불편 ..");
		
		System.out.println("\n===========================================\n");
		
// 2. 제어 문자
		
	// 1. 문자열 내에 역 슬래시(\)를 이용하여 특정 기능을 사용할 수 있다.
		
		// \n 줄 바꿈
		System.out.print("println처럼 동작\n");
		System.out.print("중간에 \n을 넣어보자");
		System.out.println();
		
		// \t 탭
		System.out.println("월\t화\t수\t목\t금");
		System.out.println("1\t2\t3\t4\t5");
		System.out.println("8\t9\t10\t11\t12");
		System.out.println();
		
	// 2. 문자열 내에서 기능을 가지는 문자 (\, ", ')
		
		// 얘네들을 출력하고 싶다면 앞에 \를 붙여준다
		System.out.println("개행 문자는 \\n이다.");
		System.out.println("소크라테스 왈 \"너 자신을 알라.\"");
		
		// 특수문자도 출력 가능하다.
		System.out.println("★");
		
		System.out.println("\n===========================================\n");

// 3. 포맷 문자열
	// 1. printf()
		// 콘솔창에 포맷 문자열 형태(format string)로 내용을 출력
		System.out.printf("%d명이 수업을 듣고 있습니다.\n", 24);
		System.out.printf("%d명이 %s을 듣고 있습니다.\n", 24, "수업");
		
		// 예시 
		System.out.printf("%02d장 표준입출력 \n", 3);
		System.out.printf("%03d장 표준입출력 \n", 12);
		// 0 : 빈 자릿 수를 채워줄 수 
		// 3 (d 바로 앞) : 자릿 수
		System.out.printf("원주율은 %.02f", 3.141592);
		System.out.printf("원주율은 %.02f", 3.1);
		System.out.printf("통장 잔고는 %,d원 입니다. \n", 1000000);


		System.out.println("\n======================표준 입력===================\n");

// 4. 표준 입력
	// 1. Scanner 클래스
		// Scanner 클래스로부터 객체 생성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		// 키보드 입력 받기
		String name = scan.nextLine();
		
		System.out.println(name + ": 좀 덥네요..");
		
		// scan.next()   또는 scan.nextInt() 등은 사용하지 않기
		// 왜? \n 을 남겨놓고 입력받은 int 값을 가져감
		// 즉, 다음 scanner에서 \n 앞의 null값을 자동으로 입력받음.
		System.out.println("에어컨 희망 온도를 입력해주세요.");
		System.out.print(">>>");
		
		// int temper = scan.nextInt();
		int temper = Integer.parseInt(scan.nextLine());
		
		System.out.println("희망온도는 : " + temper);
		
		System.out.println("냉방/난방 선택해주세요!");
		System.out.print(">>>");
		
		String mode = scan.nextLine();
		System.out.println("모드 : " + mode);
		
		
	

		
		
		
	}

}
