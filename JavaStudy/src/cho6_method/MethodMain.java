package cho6_method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// 메소드 = method = 함수 = function
		
		// 1부터 100가지 다 더하면 결과는 ?
		
//		int sum = 0;
//		
//		for(int i = 1 ; i <= 100 ; i ++) {
//			sum += i;
//		}
//		
//		System.out.println("1부터 100까지 더한 결과는 ? " + sum);

		printSum(1, 100);
		
//		sum = 0;
//		
//		for(int i = 30 ; i <= 60 ; i ++) {
//			sum += i;
//		}
//		
//		System.out.println("30부터 60까지 더한 결과는 ? " + sum);
		
		printSum(30, 60);
	
		System.out.println("\n====================================================\n");
		
		// 위 작업을 메소드로
		// 메소드 실행
		printSum(40, 60);
		
		// 함수를 쓰면 좋은 점
		// 1) 실행부의 코드가 간결해진다. (가독성 증가)
		// 2) 중복된 코드를 함수로 만들어 사용하면 해당 코드를 한 곳에서 관리할 수 있기 때문에 수정 할 때 용이함
		
		// 리턴 값이 존재하는 함수 만들기

		int rst = returnSum(80,90);
		System.out.println("80부터 90까지 더한 결과는 " + rst + "입니다.");
		
		System.out.println("\n==========================================================\n");
		
		// System.out.println();를 print()로 만들어 쓰기
		
		print("파이썬 저리가라~");
		print("파이썬 저리가라~");
	
		print(returnSum(1,10));
		
		System.out.println("\n==========================================================\n");
		 // 절댓값을 구해주는 메소드
		int number = Math.abs(-10);
		System.out.println(number);
		
		number = absolute(-10);
		System.out.println(number);
	
		System.out.println("\n==========================================================\n");

		// 이름, 국어 점수, 영어점수, 수학점수를
		// 파라미터로 넣으면
		// 이름 : 유정
		// 국어 90
		// 영어 85
		// 수학 87
		// 평균 87.11
		// 등급 : B
		// (90이상 : A  /  80이상  : B  / 그 외 : C)
		
		makeCard("유정", 90, 90, 89);
		
		
		System.out.println("\n=================================================================\n");
		
		// LoopFor 에서 했던 각 자리수 더하기 메소드화
		
		int sum = eachAdd(3758342);
		System.out.println(sum);
		
		
		System.out.println("\n=================================================================\n");

		// LoopWhile 에서 했던 포켓몬스터도 메소드로 만들어버리기
		// playPokemon();
		
		System.out.println("\n=======================재귀함수 ==========================\n");
		
		recursionPrint(5);
		
		// 팩토리얼
		long no = factorial(5);
		System.out.println(no);
		
		// 재귀함수를 이용한 factorial
		no = recFactorial(5);
		System.out.println(no);
		
	} //  main 끝
	
	public static long recFactorial(int num) {
		
		if(num == 1)
			return 1;
		
		return num * recFactorial(num-1);
	}
	
	public static long factorial(int num) {
		
		long lrst = 1;
		for(int i = 1 ; i <= num; i++) {
			lrst *= i;
		}
		
		return lrst;
	}
	
	public static void recursionPrint(int num) {
		System.out.println(num);
		if(num > 1)
		recursionPrint(num-1);
	}
	
	
	
	public static void playPokemon() {
		// 피카츄 게임
				Scanner scan = new Scanner(System.in);
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
//								System.exit(0);
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
	
	
	
	
	// 메소드의 선언
	// [접근 제어자 static] 리턴타입 메소드명 (parameter) {}
	// void는 리턴타입이 없는 메소드를 의미
	
	
	public static void printSum(int from, int to) {
		
		int sum = 0;
		
		for(int i = from ; i <= to ; i++) {
			sum += i;
		}		
		
		System.out.println(from + "부터 " + to + "까지 더한 결과는 " + sum + "입니다.");
		
		
		
	}
	
	public static int returnSum (int from, int to) {
		int sum = 0;
		
		for (int i = from ; i <= to ; i++) {
			sum += i ;
		}
		
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	// 하나의 클래스 내에 있는 메소드는 기본적으로 
	// 메소드 명이 중복되면 안 된다.
	
	// 메소드 오버로딩
	// 하나의 클래스 내에 파라미터의 타입, 수를 
	// 다르게 지정하는 경우 중복된 메소드 명을 사용할 수 있다.
	public static void print(int msg) { 
		System.out.println(msg);
	}
	
	public static int absolute(int num) {
		if (num >= 0) {
			return num;
		}else {
			return -num;
		}
	}
	
	public static void makeCard (String name, int korScore, int engScore, int mathScore) {
		String grade = "" ;
		double avg ;
		
		avg = (korScore + engScore + mathScore)/ 3.0 ;
		
		double score = weRound(avg, 2);
		
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korScore);
		System.out.println("영어 : " + engScore);
		System.out.println("수학 : " + mathScore);
		System.out.println("평균 : " + score);
		System.out.println("등급 : " + grade);	
	}
	
	/**
	 * 입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다.
	 * @param num 반올림하고자 하는 소수
	 * @param n 소수 n번째 자리까지 return
	 * @return 반올림된 소수를 리턴
	 */
	public static double weRound(double num, int n) {
		// Math.round() 은 소수 첫째자리에서 
		// 반올림한 정수를 리턴
		// 3.141592에 Math.round() 적용하면
		// 3이 된다. 그런데 3.1 로 만들고 싶다면
		
		// 3.141592에 10을 곱한다. -> 31.41592
		// Math.round(31.41592) -> 31
		// 31 / 10 = 3.1
		
		// 3.141592에 100을 곱한다. -> 314.1592
		// Math.round (314.1592) -> 314
		// 314 / 100 = 3.14
		int ten = 1;
		
		for(int i = 0; i < n ; i++) {
			ten *= 10;
		}
		
		long temp = Math.round(num*ten);
		
		double result = (double)temp / ten;
		
		return result;
	}
	
	public static int eachAdd(int num) {
		int result = 0;
		String strNum = num + "";
		
		for(int i = 0; i < strNum.length() ; i++) {
			result += Integer.parseInt(strNum.substring(i, i+1));
		}
		
		return result;
		
	}
	

}
