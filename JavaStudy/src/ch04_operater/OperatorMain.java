package ch04_operater;

public class OperatorMain {

	public static void main(String[] args) {
		
// 1. 연산자
		
		int number = 10;
		System.out.println(number);
		
	// 1) 증감 연산자
		number ++;
		System.out.println(number);
		
		number --;
		System.out.println(number);
		
		++number;
		System.out.println(number);
		
		// 앞 뒤 배치에 따라 실행순서가 조금 다르다.
		System.out.println(number++);  // 라인을 수행하고, 1을 더함
		System.out.println(number);
		System.out.println(++number);  // 1을 먼저 더하고, 라인을 수행
		
		System.out.println("\n=====================대입 연산자===================\n");
	
	// 2) 대입 연산자
		number = 10;
		
		number += 1;
		System.out.println(number); // 11
		
		number += 34;
		System.out.println(number); // 45
		
		number -= 20;
		System.out.println(number); // 25
		
		number *= 3;
		System.out.println(number); // 75
		
		number /= 5;
		System.out.println(number); // 15
		
		// 나누기의 몫이 되버린다.
		number /= 2;
		System.out.println(number); // 몫 7
		
		number %= 3;
		System.out.println(number); // 나머지 1
		
		
		
		System.out.println("\n===================== 산술 연산자 ===================\n");

// 1. 산술 연산자
		
		int numA = 10;
		int numB = 3;
		
		numA = numA + 1;
		System.out.println(numA);

		System.out.println("numA = 11, numB = 3");
		System.out.println("더하기 : "+ (numA + numB));
		System.out.println("빼기 : "+ (numA - numB));
		System.out.println("곱하기 : "+ (numA * numB));
		System.out.println("나누기 : "+ (numA / numB));
		System.out.println("나머지 : "+ (numA % numB));
		
		// 먼저 계산할 부분에 대해 ()는 필수이다 !!
		
		int temp = 1 + (2 * 3) ;
		System.out.println(temp);
		
		
		
		System.out.println("\n===================== 나머지 연산자 사용 예시 ===================\n");

		// 홀수, 짝수 판별
		int anyNum = 5437;
		
		// anyNum을 2로 나눈 나머지가 1이면 홀수, 2이면 짝수
		System.out.println(anyNum % 2);
		
		// 게시판 페이징 
		int totalCountGul = 33;  // 게시판에 글이 총33개 있다.
		int showCountOnePage = 10;  // 한 페이지에서 보여줄 글의 수가 10개다
		
		// 총 페이지의 수
		int countPage = (int)Math.ceil(totalCountGul / (double)showCountOnePage);  // Math.ceil은 올림 함수 (double로 리턴)
		System.out.println(countPage);
		
		// 마지막 페이지에 있는 글의 수
		// 33을 10으로 나눈 나머지 = 3
		int lastPageCount = totalCountGul % showCountOnePage;
		System.out.println(lastPageCount);
		
		
		
		
		System.out.println("\n===================== 문자열 더하기 ===================\n");
		
		String subway = "반석역";
		subway = subway + " 지족역";
		System.out.println(subway);
		
		// 대입 연산자로도 문자열 더하기 (이어붙이기)가 가능하지만 뒤에만 추가된다.
		subway += " 노은역";
		System.out.println(subway);
		
		subway = "종점 " + subway + " 월드컵 경기장";
		System.out.println(subway);
		
		
		
		
		
		System.out.println("\n===================== 비교 연산자 ===================\n");
		
		int numFive = 5;
		double pi = 3.14;
		int numOne = 1;
		
		// 결과에 따라 true 혹은 false 리턴
		System.out.println(numFive > numOne);
		
		boolean result = numFive < numOne;
		System.out.println(result);
		
		// 타입이 다른 숫자도 비교 가능
		System.out.println(numFive >= pi);
		
		// > < >= <= == != 등
		System.out.println(1 + 2 == 3);
		System.out.println(1 + 2 != 3);
		System.out.println(numOne == numFive);
		
		// 문자에 대해서도 비교 연산이 가능하다.
		System.out.println('가' > '나');
		
		// 문자열을 정렬하는 로직을 만들 때, 문자열 앞 글자만 char타입으로 꺼낸 후 비교하여 정렬하면 된다.
		String stuA = "고동욱";
		String stuB = "김대일";
		System.out.println(stuA.charAt(0) > stuB.charAt(0));
		
		// (자바에서는) 문자열이 서로 같은지 비교하기 위해서는
		// .equals(문자열) : 해당 문자열이 괄호 안 문자열과 같은지 비교
		String ship = "배";
		String pear = "배";
		String bae = new String("배");
		
		System.out.println(ship == pear);
		System.out.println(ship == bae);
		System.out.println(ship.equals(bae));
		
		// 예시 
		// 서버에서 데이터를 가져오는데 문제가 생기면 null값으로 넘어온다.
		// 데이터를 받아오는 쪽에서 null 체크
		String serverDate = null;
		
		if(serverDate != null) {
			System.out.println("not null");
		} else {
			System.out.println("null");
		}
		
		//사용자의 입력을 가지고 왔더니 입력하지 않은 데이터가 empty로 온다.
		String inputData = "";
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length() == 0);
		System.out.println(inputData.isEmpty());
		
		
		System.out.println("\n===================== 삼항 연산자 =====================\n");

		String inputId = "khgty1226";
		
		// inputId의 길이가 7 이상이면 통과 or 재입력
		String check = (inputId.length() >= 7) ? ("통과") : ("재입력");
		System.out.println(check);
		
		
		// inputId가 empty가 아니라면 1, empty라면 0
		int check2 = (inputId.isEmpty()) ? (1) : (0);
		System.out.println(check2);
		
		// 이중 삼항 연산자
		// if문과 비슷함
		int score = 75;
		String grade = (score > 90) ? ("A") : ((score > 80) ? ("B"):("C"));
		
		System.out.println(grade);
		
		
		
		System.out.println("\n===================== 논리 연산자 =====================\n");

		int inputAge = 12;
		String inputPhone = "01073584002";
		
		if((inputAge == 14)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		String name = "김현곤";
		String Phone = "01073584002";
		int age = 15;
		
		boolean checkName = name.length() >0;
		boolean checkPhone = Phone.length() ==10 || Phone.length() ==11;
		boolean checkAge = age >= 14;
		
		System.out.println(checkName && checkPhone && checkAge);
		
		
		System.out.println("======================================");
		
		
		
		
		
		
		
		
		
		
		
	}

}
