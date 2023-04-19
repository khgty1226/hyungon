package ch02_variable;

public class VariableName {
	// 변수명, 클래스명 등 명명 규칙
	
	// 1 프로젝트 이름은 앞에 대문자를 쓴다. 
	// 다음 단어의 앞 글자도 대문자를 쓴다. (JavaStudy, MyProject 등)
	
	// 2 패키지 (폴더)의 이름은 전부 소문자로 쓴다.
	// 필요하면 단어 사이에 언더바(_)를 추가한다.
	
	// 3 클래스 이름은 프로젝트 이름 짓는 법과 동일
	
	// 4 변수명 짓기 (= 함수명 짓기)
	// 카멜(Camel) 방식 : 첫 글자는 소문자, 다음 단어들은 대문자로 시작. (가장 많이 쓰는 명명방식)
	int todayIsHappy = 0;
	
	// 스네이크 방식 : 소문자 or 대문자로 통일. 언더바로 단어 구분.
	int today_is_happy = 0;
	int TODAY_IS_HAPPY = 0;
	
	// 헝가리안 방식 : 변수명 앞에 변수의 타입 적어두는 방식.
	int intTodayIsHappy = 0;
	String strTodayIsHappy = "행복";
	
	// 변수명 앞에는 앞에 v_를 붙이고
	// 함수명 앞에는 앞에 f_를 붙이고
	// 파라미터명에는 앞에 p_를 붙이는 방식
	int v_todayIsHappy = 0;
	
	
}
