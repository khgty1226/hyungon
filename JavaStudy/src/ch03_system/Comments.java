package ch03_system;

public class Comments {

	// 자바 문서(javadoc) 주석
	/**
	 * 바나나는 노랗다.
	 */
	
	
	static String banana = "바나나";
	
	public static void main(String[] args) {
		// 주석 (Comment)
		
		// 단일 주석 (코드 앞에 //)
		// 참고로 프로그래밍 언어마다 다른 주석을 사용하는 경우가 많다.
		// 파이썬 : #, SQL : -- , HTML : <!- ->
		// 단축키 : ctrl + /
		// 다중 주석 : /*  */ (/* + enter) 
		
	
		// 자바 문서(javadoc) 주석
		// : 보통은 메소드 사용법에 대해 설명하는 용도로 사용
		String fruits = "Apple";
		fruits.substring(2);
		
		System.out.println(banana);
		
		// TODO 주석
		// 개발 중간중간에 구현해야 할 부분에 대해 미리 말로 작성하는 경우 사용
		// (역할, 일정 등)
		// Window - Show View - Tasks 에 TODO 주석들의 위치가 다 뜸
		
		
		// TODO 바나나를 콘솔창에 출력할 예정
		
		
	}

}
