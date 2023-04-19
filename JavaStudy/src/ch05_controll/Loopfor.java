package ch05_controll;

public class Loopfor {

	public static void main(String[] args) throws InterruptedException {
		// 콘솔 창에 1부터 10까지 출력

		// for 문
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		System.out.println("");

		// for문 내 선언된 변수 i는 for 문 종료 후 메모리에서 삭제
		// System.out.println(i); --> 작동x

		// for문 내 변수 i는 for문의 반복 횟수를 정하기 위함이
		// 주 목적이므로 꼭 i를 for문 내에서 사용하지 않아도 된다.
		int one = 1;

		for (int i = 0; i < 10; i++) { // 10번 반복
			System.out.println(one++);
		}
		System.out.println("");

		// i는 for문 내에서 사용되는 단순한 변수명일 뿐이므로
		// i가 아닌 다른 단어를 사용해도 된다.

		int sum = 0;
		// 1부터 20까지 더하기

		for (int i = 1; i < 21; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println("");

		sum = 0;

		for (int i = 21; i < 46; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("");

		sum = 0;

		for (int i = 1; i <= 40; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
		System.out.println("");

		sum = 0;

		for (int i = 0; i <= 40; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("");

		sum = 0;

		for (double i = 0; i <= 2; i += 0.2) {
			System.out.println(i);
		}

		System.out.println("");

		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i / 10.0);
		}
		System.out.println("");

		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i / 10.0);
			}
		}

		System.out.println("");

		for (int i = 0; i < 11; i++) {
			System.out.println(i * 2 / 10.0);
		}

		System.out.println("\n=======================================\n");

		// 구구단 2단 출력

		for (int i = 1; i < 10; i++) {
			System.out.printf("2 x %d = %d", i, i * 2);
			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + (i * 2));
		}

		System.out.println("\n======================================\n");

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");

		System.out.println("");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		String star = "";

		for (int i = 0; i < 5; i++) {
			star = star + "*";
			System.out.println(star);
		}

		System.out.println("\n=================== 국수 나무 ===================\n");

		// 나머지 연산자(%)의 사용 예시
		// for문 내에서 순환하는 숫자에 대해 사용

		// 국수공장에서 면을 20cm 뽑고 있는데,
		// 면을 5cm 마다 잘라주기

		for (int i = 0; i < 20; i++) {
			System.out.println("||||||||");

			if (i % 5 == 4)
				System.out.println("");

		}

		System.out.println("\n=================== 신라면 ===================\n");
		// 라면 공장에서 면을 30cm 뽑고 있는데
		// 6cm 마다 자라주어야 한다.

		/*
		 * /////// \\\\\\\ ///////
		 */

		for (int i = 1; i < 31; i++) {

			if (i % 2 == 0) {
				System.out.println("/////////");
			} else {
				System.out.println("\\\\\\\\\\\\\\\\\\");
			}
			if (i % 6 == 0)
				System.out.println("");

//			Thread.sleep(400);   // 400ms

		}

		System.out.println("\n======================================\n");

		// 10부터 1까지 출력

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("\n=======================================\n");

		// for문으로 String 가지고 놀기
		// 숫자의 각 자릿 수를 더한 결과를 출력
		
		// 자동 줄 맟춤 
		// 단축키 [ ctrl + shift + f ]

		int example = 4784593;
		String strTest;
		int result = 0;
		strTest = example + "";

		for(int i = 0; i < strTest.length(); i++) {
			String test = strTest.substring(i,i+1);
			result += Integer.parseInt(test); 
			System.out.println(result);
		}
		
		System.out.println("\n=======================================\n");
		
		// 슈의 갯수는?
		String syu = "슈슈숫ㅅㅅ슛ㅅ슈ㅜ수슛수숫슛슈수ㅜㅜ";
		int syuCount = 0;
		
		for(int i = 0; i < syu.length() ; i++) {
			if(syu.charAt(i) == '슈') {
				syuCount += 1;
			}
		}
		
		System.out.println(syuCount);
		
		syuCount = 0;
		
		for(int i = 0; i < syu.length(); i++) {
			String str = syu.substring(i, i+1);
			
			if(str.equals("슈")) {
				syuCount++;
			}
		}
		
		System.out.println(syuCount);
		
		System.out.println("\n=======================================\n");
		
		// break문
		// 반복문 내에서 break문이 실행되면
		// 해당 반복문을 즉시 종료
		
		// 1부터 n까지 더한다고 했을 때,
		// 더한 값이 100 이상이 되는 지점의 n을 구하고 싶다.
		
		sum = 0;
		
		for(int i = 1; i < 9999 ; i++) {
			sum += i;
			
			if (sum >= 100) { 
				System.out.println(i);
				break;
			}
		}
		
		
		System.out.println("");
		
		// continue : 이후 코드는 무시하고, 다음 증감식으로 진행.
		// 구구단 6단을 출력하는데
		// 너무 쉬운 1, 2, 3 부분은 출력 x
		
		for(int i = 1; i < 9; i++) {
			
			if(i < 4)
				continue;
			
			System.out.println("6 x " + i + " = " + i*6);
		}
		
		
		// 구구단
		
		for (int i = 1; i < 10 ; i++) {
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " x " + j +" = "+ (i*j));
			}
			System.out.println();
		}
		
		/*
		 * 디버깅 모드
		 * 
		 * 코드라인 좌측 연두색 부분을 더블 클릭하여
		 *  breakpoint (초록점)를 만든 후   [단축키 ctrl + shift + B]
		 * 디버깅 실행
		 * [단축키 F11 ]
		 * 
		 * 목적 : 코드를 한 줄씩 실행해보며, 변수에 어떤 값이 담기고 있는지 확인
		 * 
		 * 디버깅 실행 (상단 벌레 모양 아이콘 클릭)
		 * 처음에 디버깅 모드에 적합한 화면으로 전환
		 * breakpoint에서 대기
		 * 이후 한 줄씩 대기
		 * 
		 * step over [F6] : 한 줄씩 실행
		 * Terminate [ctrl + F2] : 디버깅 종료
		 * 
		 * 다시 원래 화면으로 돌아오려면 우측 상단에 Java perspective 클릭
		 * */
		
		System.out.println("\n=============================\n");
		
		// 트리
		
		for (int i = 0 ; i < 5; i ++) {
			String space = "";
			for(int k = 0; k < (4-i); k++) {
				space += " ";
			}
			
			
			String stars = "";
			for(int k = 0 ; k < i+1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		
		}
		
		System.out.println("\n=============================\n");
		
		//    *    
		//   ***   
		//  *****  
		// *******
		//*********
		
		
		for( int i = 0 ; i < 5; i++) {
			String space = "";
			String stars = "";
			
			for (int k = 0; k < i ; k++) {
				space += " ";
			}
			
			for ( int k = 0; k < (9-(i*2)) ; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
		
		
		// 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
