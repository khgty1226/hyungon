package ch02_variable;

public class VariableType {
	// 변수의 타입 (기본 타입)
	
	// 정수 타입
	byte byteVar = 1;
	short shortVar = 2;
	int intVar = 3;
	long longVar = 4;
	long longVar2 = 3000000000L; //long 타입은 L을 붙여주어야 함. 그러지 않으면 int로 인식.
	
	// 정수이면서 문자에 해당
	char charVar = 44032; // char타입은 숫자를 문자로 인식.  44032는 유니코드 '가'를 의미.
	char ga = '가'; // 44032와 같다.
	
	// 소수 타입
	float floatVar = 3.14f;
	double doubleVar = 3.14; // float은 f를 붙여야해서 보통 double을 사용
	
	// 불리언 타입 (true / false)
	boolean boolVar = false;
	
	// 문자열 타입 (문자. char는 한 글자 / 문자열은 0글자 이상)
	String strToday = "오늘은 3월 21일"; // 글자 수 제한은 없다고 봐도 무방함. 
	
}
