package ch02_variable;

public class VariableMain {
	public static void main(String[] args) {
		
		// 변수의 선언 
		// [변수 타입] [변수명]의 형태
		int myMoney ;
		
		// 값을 담지 않은 경우 사용할 수 없다. (선언만 가능)
//		System.out.println(myMoney); 
//		주석처리 단축키 (ctrl + /)
		
		// 변수에 값을 할당
		// 변수 초기화 (Initialization = init)라고 한다. 
		// 등호(=)를 이용하여 변수에 값을 담을 수 있다.
		// 등호(=) : 등호 오른쪽의 값을 왼쪽에 담는다. 
		myMoney = 10000;
		System.out.println(myMoney);
		
		// 변수의 값을 변경할 수 있다.
		// 그러니까 변수라고 부름. 값이 변할 수 있는 녀석
		myMoney = 1_000_000; // 언더바로 3자리마다 구분 가능.
		System.out.println(myMoney);
		
		// 변수의 선언과 함께 값을 할당하는 방식
		int numOne = 1;
		double pi = 3.14;
		
		System.out.println(numOne);
		System.out.println(pi);
		
		// 상수(constant)의 선언
		// 값이 항상 같은 녀석
		// 값이 바뀌면 안 되는 녀석에 대해 상수로 선언하여 사용.
		// 모두 대문자로 선언
		final double MATH_PI = 3.14;
		// 함수는 값을 바꿀 수 없다.
		// MATH_PI = 3;
		
		System.out.println("\n======================================== \n");
		
		// 변수를 사용하는 이유
		// 콘솔창에 숫자 10을 10번 출력해보세요
		int ten = 20;
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		System.out.println(ten);
		// 수정이 용이하다.
		// 값에 이름을 부여할 수 있다.
		int myAge = 31;
		System.out.println(myAge);
		
		System.out.println("\n===============String 메소드===============\n");
		
		// 문자열 String 
		// 문자열은 클래스이므로, 다양한 메소드를 내장하고 있다.
		String fruits = "Apple, Banana, Cherry";
		
		// .length() : 해당 문자열의 길이를 리턴
		int leng = fruits.length();
		System.out.println(leng);
		
		// .charAt(인덱스) : 해당 문자열에서 해당 인덱스에 해당하는 문자(char)를 리턴.
		// 인덱스는 배열, 문자열에서 몇 번째에 해당하는 숫자
		char alphaL = fruits.charAt(3);
		System.out.println(alphaL);
		
		// .indexOf(문자열) : 해당 문자열에서 괄호 안에 있는 문자열의 인덱스를 리턴
		System.out.println(fruits.indexOf("Banana"));
		// 대소문자를 구분한다. 
		// 괄호 안 문자열이 존재하지 않으면 -1 리턴
		System.out.println(fruits.indexOf("banana"));  
		// 처음 발견된 녀석의 인덱스만 리턴
		System.out.println(fruits.indexOf("p"));
		
		// .substring (시작 인덱스, 끝 인덱스) : 해당 문자열의 시작 인덱스~ 끝 인덱스전까지 잘라 문자열 출력.
		System.out.println(fruits.substring(7,13));
		// 자른 값을 리턴, 실제 해당 열을 잘라 버리진 않는다. 
		// .substring (시작 인덱스) : 해당 문자열을 시작 인덱스 ~ 끝까지 리턴
		System.out.println(fruits.substring(15));
		
		// .replace(바뀐 문자열, 바꾸고 싶은 문자열) : 문자열 교체
		System.out.println(fruits.replace("Cherry", "Chamwui"));
		// 원본은 변하지 않는다. 
		System.out.println(fruits);
		
		// 원본은 바꾸고 싶다면
		fruits = fruits.replace("Cherry", "Chanwui");
		System.out.println(fruits);
		
		// .trim() : 다듬다 라는 뜻. 해당 문자열의 양 끝에 존재하는 모든 모든 공백 문자 제거해준다.
		String world = "  The New World!!    ";
		System.out.println(world.trim());
		System.out.println(world);
		System.out.println(world.replace(" ", ""));    // 모든 공백 다 제거 (부적합)
		
		// .toUpperCase()
		// .toLowerCase()
		// 해당 문자열에 존재하는 알파벳들을 전부 대문자 or 소문자로 바꿔줍니다.
		
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());
		System.out.println(fruits);
		
		// .concat(문자열)
		// 해당 문자열 뒤에 괄호 안에 있는 붙인다.
		System.out.println(fruits.concat(", Durian"));
		
		// 문자열은 더하기(+) 기호를 통해 추가 가능
		System.out.println(fruits +", Durian");
		
		fruits = fruits + ", Durian";
		System.out.println(fruits);
		
		fruits = "과일 목록:" + fruits;
		System.out.println(fruits);
		
		
		System.out.println("\n=====================================================\n");
		// String은 기본 타입이 아닌 참조 타입이므로 Null 값을 가질 수 있다.
		// 참조타입의 변수를 객체(instance)라고 부른다. 
		String empty = "";   // 힙에 "" 저장
		System.out.println(empty);    // 빈 문자열을 empty라고 부른다. 
		
		String strNull = null;  // 힙에 아무것도 저장하지 않음. 즉 아무 주소도 참조하지 않음.
		System.out.println(strNull);
		
		
		System.out.println(empty.concat("채웠음."));
//		System.out.println(strNull.concat("채웠음"));
		
		System.out.println("\n========================= char ===========================\n");
		
		// 문자(char)
		// 작은 따옴표 ('')안에 한 문자를 담을 수 있으며
		// 숫자 또한 담을 수 있다.
		// 이때의 숫자는 유니코드에 등록된 각 문자들에 대한 넘버링이다.
		
		// A는 유니코드에서 65번째에 위치
		char wordA = 'A';
		char numA = 65;
		
		System.out.println(wordA);
		System.out.println(numA);
		
		// 한글 '가'는 유니코드에서 44032번째 위치
		char hangul = 44032;
		System.out.println(hangul);
		
		hangul++;  // 1을 더한다.
		System.out.println(hangul);
		
		// byte는 -128 ~ 127 까지 담을 수 있다.
		byte byteNum = 127;
		byteNum++;
		System.out.println(byteNum);   // 담을 수 있는 수를 넘으면 다시 최초값부터 돌게 됨.
		
		System.out.println("\n=========================== 형 변환 ========================\n");
		
		// 형 변환(Casting)
		// 형 변환이 가능한 경우에는 형 변환을 이용해서 상황에 맞게 적절히 사용할 수 있다.
		
		int intVal = 15;
		double doubVal = 1.23;
		
		System.out.println(intVal * doubVal);
		
		// int * double은 double타입으로 자동으로 형 변환
		
		double mulResult = intVal * doubVal ;
		
		// int * float은 float 타입으로 자동 형 변환
		float floatResult = intVal * 1.23f ;
		
		// int 20000이 long타입으로 자동 형 변환되어 담긴 것.
		long longVal = 20000;
		
		// 숫자 더하기 문자열(String)을 하면
		// 숫자가 문자열로 자동 형 변환이 되어
		// 문자열 더하기(이어 붙이기)가 된다.
		String name = "찬웅";
		String age = name + 31;
		System.out.println(age);
		
		// 강제 형 변환 
		// (타입) 값
		// 형변환이 가능한 경우에 대해, 해당 값이 괄호 안 타입으로 변환된다.
		int intCast = (int)3.3333;
		System.out.println(intCast);
		
		// 주의해야 할 점
//		int mulVal = (int)10 * 3.3333;   //10을 형 변환
		int mulVal = (int)(10 * 3.3333);
		System.out.println(mulVal);
		
		// 많이 하는 실수
		double result = 10 / 3;  // 3.3333 예상
		System.out.println(result);   // 3.0
		// result가 3.3333이 되도록
		result = (double)10 / 3;
		System.out.println(result);   // 3.33333333
		
		// 숫자 문자열과 숫자간의 형 변환
		String strNum = "1234";
		System.out.println(strNum + 2);   // 문자열로 변환됨
		
		// 문자열을 정수 타입으로 형변환
//		Integer.parseInt(숫자 문자열) !!! 중요 !!
		int intNum = Integer.parseInt(strNum);
		System.out.println(intNum + 2);
		
		// 정수타입을 문자열로 형변환
//		Integer.toString(숫자)   
		String strCast = intNum + "";
		System.out.println(strCast + 2);
		
		
		
		
		
		
		
	}

}
