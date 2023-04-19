package ch05_controll;

public class Conditional {

	// 전역변후
	// class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용 가능하다.
	static String subject = "조건문";
	
	public static void main(String[] args) {

		// 조건문
		
		// if문
		
		int price = 30000;
		int myMoney = 10000;
		
		if(myMoney < price) {
			System.out.println("돈이 부족합니다.");
		}
		// 한 줄로 써도 된다.
		
		System.out.println("=======================================");
		
		// 변수의 사용 범위(Scope)
		// 중괄호 블록{} 내부에 선언된 변수는 
		// 해당 중괄호 바깥에서 사용 할 수 없다. (지역 변수)
		
		String review = "맛있어요~";
		String warning = "";
		
		if(review.length() < 12) {
			warning = "리뷰는 12자 이상 작성하세요.";
		}else {
			warning = "통과";
		}

		System.out.println(warning);
		// 이를 삼항 연산자로 표현
		
		warning = (review.length() < 12) ? ("리뷰는 12자 이상 작성하세요.") : ("통과");
		System.out.println(warning);
		
		System.out.println(subject);
		
		System.out.println("\n=======================================\n");
		
		// else와 else if
		
		System.out.println("\n=======================================\n");
		
		// 리모콘의 전원 버튼의 경우
		// 전원 버튼 하나로 on/off가 다 가능하다.
		
		// 전원 버튼을 눌렀을 때의 로직
		// Tv의 전원 상태
		boolean isPowerOn = false;
		
		if(isPowerOn == true) {
			// TV가 켜져있는 경우
			System.out.println("TV를 끕니다.");
			isPowerOn = false;
		}else {
			// TV가 꺼져있는 경우
			System.out.println("TV를 켭니다.");
			isPowerOn = true;
		}
		
		// boolean의 true/false 를 스위치처럼 사용하는 것을
		// 토글(toggle) 또는 플래그(flag)라고 한다.
		
		int score = 85;
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		
		System.out.println(grade);
		
		// 코드 압축
		grade = "C";
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}
		
		System.out.println(grade);
		
		// 순서에 주의해야 하는 경우
		// 혹은 범위를 명확히 하기
		
		
		System.out.println("\n====================================\n");
		
		/* 회원가입 조건 체크
		 이름은 한 글자 이상
		 휴대폰 번호는 10자리 또는 11자리
		 나이는 14세 이상
		*/
		
		// level 1
		
		String name = "문동은";
		String phone = "01073584002";
		int age = 29;
		
		if(name.length() >= 1) {
			if(phone.length() == 10 || phone.length()== 11) {
				if(age >= 14) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
			}else {
				System.out.println("회원가입 실패");
		}
		}else {
			System.out.println("회원가입 실패");
		}
		
		
		// level 2
		
		boolean isOkay = false;
		
		if(name.length() >= 1) {
			if(phone.length() == 10 || phone.length()== 11) {
				if(age >= 14) {
					isOkay = true;
				}
			}
		}
		
		if(isOkay == true)
			System.out.println("회원가입 성공");
		else System.out.println("회원가입 실패");
		
		
		// level 3
		
		if(name.length() > 0 
				&& (phone.length() == 10 || phone.length() == 11)
				&& age >=14
				) {
			System.out.println("회원가입 성공");
		}else	System.out.println("회원가입 성공");

		
		System.out.println("\n====================================\n");

		// 값을 매칭하는 경우가 많을 때 사용
		
		// 여러분들의 교육기관 (단위 : 열)
		int month = 0;
		
		if (month == 0) {
			System.out.println("열심히 배우는 중");
		}else if (month == 1) {
			System.out.println("DB 마스터");
		}else if(month == 2) {
			System.out.println("자바 마스터");
		}else if (month == 3) {
			System.out.println("화면구현 마스터");
		}else if (month == 4) {
			System.out.println("JSP 마스터");
		}else if (month == 5) {
			System.out.println("팀 프로젝트 시작");
		}else {
			System.out.println("수료 !");
		}
		
		// -> switch 문으로 변경
		
		switch(month) {
		case 0: 
			System.out.println("열심히 배우는 중");
			break;
		case 1:
			System.out.println(" DB 마스터");
			break;
		case 2:
			System.out.println("자바 마스터");
			break;
		case 3:
			System.out.println("화면구현 마스터");
			break;
		case 4:
			System.out.println("JSP 마스터");
			break;
		case 5:
			System.out.println("팀 프로젝트 시작");
			break;
		default:
			System.out.println("수료!");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
