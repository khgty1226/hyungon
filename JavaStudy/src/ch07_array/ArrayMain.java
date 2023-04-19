package ch07_array;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMain {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		// 배열
		
		// 숫자 4는 첨자를 의미하여, 배열의 크기를 정한다.
		// 배열의 크기는 바뀌지 않는다.
		
		String[] seoyugi = new String[4];
		
		
		// .length 로 길이 리턴 (메소드는 아님)
		System.out.println(seoyugi.length);
		
		// 배열 내 요소(element) 확인하기
		// 인덱스 사용 (= 인덱싱)
		
		System.out.println(seoyugi[0]);
		
		// 처음 생성된 배열 내에는 기본 값(default)이 들어있다.
		// 참조 타입 : null
		// 기본 타입 : 숫자면 0 ( 소수면 0.0), boolean은 false
		int numbers [] = new int[3];
		boolean bools[] = new boolean[5];
		System.out.println(numbers[0]);
		System.out.println(bools[0]);
		
		System.out.println("\n==========================================================\n");
		
		// 배열에 값 넣기
		seoyugi[0] = "삼장";
		System.out.println(seoyugi[0]);  
		
		seoyugi[1] = "오공";
		seoyugi[2] = "사오정";
		seoyugi[3] = "팔계";
		
		
		for(int i = 0 ; i < seoyugi.length ; i++) {
			System.out.println(seoyugi[i]);
		}
		
		printArray(seoyugi);
		
		
		System.out.println("\n==========================================================\n");
		
		// 배열의 단점
		// 크기가 고정됨 
		// 늘어나지도, 줄어들지도 않으며
		// 값을 추가하거나 제거하지도 못한다.
		
		// 코드 편집기에서 빨간 줄이 쫙 그이는 에러 : 컴파일 에러
		// 실행했을 경우 발생하는 에러 : 런 타임 에러
//		seoyugi[4] = "크리링";   // 런타임 에러
		
		// 배열의 장점
		// for문을 이용하여 배열에 담긴 모든 요소들을 
		// 한 번에 처리할 수 있다. (데이터 처리)
		
		for(int i = 0 ;  i < seoyugi.length ; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		
		printArray(seoyugi);
		
		// 배열 내 특정 요소에 접근하여 처리 할 수 있다.
		// 서유기 오공 -> 드래곤볼 오공
		
		for(int i = 0; i < seoyugi.length ; i++) {
			if(seoyugi[i].contains("오공")) {   //포함되어 있으면 true
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			};
		}
		
		printArray(seoyugi);
		
		System.out.println("\n==========================================================\n");

		int[] intArray = new int[6];
		
		// 기존 값 넣는 방식
		
		for(int i = 0 ; i < intArray.length ; i ++) {
			// 로또 번호
			// 1~45 사이의 랜덤 숫자
			// Math.random() -> 0~1 사이의 랜덤 소수
			// Math.random() * 5 -> 0~5미만의 랜덤 소수
			// (int)(Math.random() * 5) -> 0~4 사이의 랜덤 정수
			// (int)(Math.random() * 45) -> 0~44 사이의 랜덤 정수
			// (int)(Math.random() * 45) + 1 -> 1~45 사이의 랜덤 정수
			
			intArray[i] = (int)(Math.random() * 45) + 1;
		}
		
		printArray(intArray);
		
		
		System.out.println("\n==========================================================\n");

		// 값을 넣으며 배열 선언 
		
		String[] students = {"홍민경", "유동윤", "박진영", "김대일"};
		
		printArray(students);
		
		
		System.out.println("\n==========================================================\n");
		
		// 문자열 나누기
		
		String subjects = "자바, SQL, 자바스크립트, JSP";
		
		// .split(문자열)
		
		// 괄호 안 문자열을 기준으로 해당 문자열을 나누어 
		// 문자열 배열로 리턴
		String[] subjectArray = subjects.split(", ");
		
		printArray(subjectArray);
		
		// 데이터가 잘 정돈되어 있지 않다면 
		// , 로 일단 나누고 양쪽 공백을 제거해주면 된다. (trim)
		
		for(int i = 0 ; i< subjectArray.length; i++) {
			subjectArray[i] = subjectArray[i].trim();
		}
		
		printArray(subjectArray);
		
		// 배열의 복사
		
		String[] sinSeoyugi = seoyugi;   
		
		printArray(sinSeoyugi);
		
		sinSeoyugi[0] = "강호동";
		sinSeoyugi[1] = "이수근";
		
		printArray(sinSeoyugi);
		printArray(seoyugi);   // 기존 배열에 영향을 미친다.
		
		
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		
		System.out.println(seoyugi.hashCode());
		System.out.println(sinSeoyugi.hashCode());
		
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		// 해쉬코드 (hashcode)
		// 객체의 메모리 주소값을  이용해서
		// 해쉬를 적용한 코드
		
		// 해쉬 (hash)
		// 해쉬함수 (암호화 알고리즘)를 이용해서
		// 데이터를 암호화하는 기법 (대표 SHA-256)
		
		String password = "1q2w3e4";
		
		String encryptPw = encrypt(password); 
		System.out.println(encryptPw);
		
		String loginPw = "1q2w3e4";
		System.out.println(encrypt(loginPw));
		
		// 올바른 배열 복사
		String[] newSeoyugi = seoyugi.clone();
		
		printArray(seoyugi);
		printArray(newSeoyugi);
		
		
		newSeoyugi[2] = "은지원";
		printArray(newSeoyugi);
		printArray(seoyugi);
		
		
		//.clone을 까먹었다.
		String[] copy = new String[seoyugi.length];
		
		for(int i = 0 ; i < copy.length; i ++) {
			copy[i] = seoyugi[i];
		}
		
		printArray(copy);
		
		
		System.out.println("\n==========================================================\n");
		
		// 숫자 배열
		int[] numArray = {23, 456, 213, 32, 464, 1, 2};
		
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		
		// 인덱스 0번, 1번 바꾸기
		
		int temp ;
		temp = numArray[0];
		numArray[0] = numArray[1];
		numArray[1] = temp;
		
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		
		printArray(numArray);
		swap(0, 1, numArray);
		printArray(numArray);
		
		// 가끔 면접에서 묻는 문제
		// Call by value 와 Call by Reference 구분
		// 기본타입 변수에 대해서는 Call by Value
		// 참조타입 변수에 대해서는 Call by Reference
		int a = 10;
		int b = a;
		
		System.out.println(b);
		
		a = 20;
		System.out.println(b);
		
		swap (a, b);
		System.out.println(a);
		System.out.println(b);
		
		
		// 다차원 배열
		
		int [] oneDir = {1, 2, 3};
		int [][] twoDir = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		// 행렬로 나타낸다면
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		//twoDir으로부터 {7, 8, 9} 을 꺼내고 싶다.
		
		int[] tempArray = twoDir[2];
		printArray(tempArray);
		
		
		System.out.println(twoDir[1][2]);
		
		
		// 2차원 배열은 1차원 배열 내에 1차원 배열들이 존재
		// 3차원 배열은 1차원 배열 내에 2차원 배열들이 존재하면 됨
		
		int[][][] threeDir = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
								, {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}
								,{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
		
		// 0층의 행렬
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		// 1층의 행렬
		// 10 11 12
		// 13 14 15
		// 16 17 18
		
		
		System.out.println(threeDir[2][0][2]);
		
		
		System.out.println("\n =========================================================== \n");
		
		// 정렬
		int[] numberArray = {23, 452, 13, 1, 67, 54};
		
		// Arrays.sort(배열)
		// 해당 배열을 오름차순 정렬
		
		Arrays.sort(numberArray);
		printArray(numberArray);
		
		// 내림차순 정렬
		// 이 방법은 참조 타입에 해당하는 객체를 담은 배열일 경우에만 가능
//		Arrays.sort(numberArray, Collections.reverseOrder());
		
		// 그렇다면 어떻게 해야하나 ?
		// numberArray에 모든 요소에 -1을 곱하고
		// Arrays.sort() 적용
		// 다시 numberArray의 모든 요소에 -1 곱하기
		
		for(int i = 0 ; i < numberArray.length ; i++) {
			numberArray[i] = (numberArray[i] * (-1));
		}
		Arrays.sort(numberArray);
		for(int i = 0 ; i < numberArray.length ; i++) {
			numberArray[i] = (numberArray[i] * (-1));
		}
		printArray(numberArray);
		
		
		
		System.out.println("\n =========================================================== \n");

		// 알고리즘으로 정렬
		/* 1) 버블 정렬
			
		
		*/
		
		/* 2) 선택 정렬
			1. 주어진 리스트에서 최솟값을 찾는다.
			2. 최솟값을 맨 앞 자리의 값과 교환한다.
			3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다. 
		*/
		
		for(int k = 0; k < numberArray.length-1 ; k++) {
			for(int i = 0 ; i < numberArray.length-1; i++) {
				if(numberArray[i] >= numberArray[i+1]) {     // 오름차순
					int temp1 = numberArray[i];
					numberArray[i] = numberArray[i+1];
					numberArray[i+1] = temp1;
				}
					
			}
		}
		printArray(numberArray);
		
		for(int k = 0; k < numberArray.length-1 ; k++) {
			for(int i = 0 ; i < numberArray.length-k-1; i++) {
				if(numberArray[i] < numberArray[i+1]) {     // 내림차순
					int temp1 = numberArray[i];
					numberArray[i] = numberArray[i+1];
					numberArray[i+1] = temp1;
				}
					
			}
		}
		printArray(numberArray);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void swap (int p_a, int p_b) {
		int temp = p_a;
		p_a = p_b;
		p_b = temp;
	}
	
	public static void printArray (String[] str) {
		for (int i = 0 ; i < str.length ; i ++) {
			if(i == 0)
				System.out.print(str[i]);
			else
				System.out.print(", " + str[i]);
		}
		System.out.println();
	}
	
	public static void printArray (int[] intArray) {
		for (int i = 0 ; i < intArray.length ; i ++) {
			if(i == 0)
				System.out.print(intArray[i]);
			else
				System.out.print(", " + intArray[i]);
		}
		System.out.println();
	}
	
	 public static String encrypt(String text) throws NoSuchAlgorithmException {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(text.getBytes());

	        return bytesToHex(md.digest());
	    }

	 private static String bytesToHex(byte[] bytes) {
	        StringBuilder builder = new StringBuilder();
	        for (byte b : bytes) {
	            builder.append(String.format("%02x", b));
	        }
	        return builder.toString();
	    }

	 public static void swap (int idxA, int idxB, int[] numArray) {
			int temp ;
			temp = numArray[idxA];
			numArray[idxA] = numArray[idxB];
			numArray[idxB] = temp;
	 }
}
