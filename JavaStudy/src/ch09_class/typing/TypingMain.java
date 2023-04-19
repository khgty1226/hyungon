package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		// 타자 연습 게임
		
		Scanner scan = new Scanner(System.in);
		
		// 단어 목록
		
		// static 메소드는 해당 클래스를 굳이 객체로 만들지 않더라도 사용이 가능하다.
		ArrayList<String> wordList = Dictionary.makeWordList(Dictionary.OPTION_RANDOM_ALPHABET);
		
		
		
		
		// 현재 시간을 저장
		// 1970년 1월 1일을 기준으로
		// 현재까지 경과된 시간을 밀리초 단위로 리턴 (1초 = 1000 밀리초)
		
		long before = System.currentTimeMillis();
		System.out.println(before);
		
		boolean match = true;
		int randIndex = (int)(Math.random() * (wordList.size()));
		
		while(true) {
			
			if(match) {
			randIndex = (int)(Math.random() * (wordList.size()));
			}
			
			match = false;
			
			// wordList에 담긴 단어가 출력
			System.out.println(wordList.get(randIndex));
			
			// 출력된 단어를 입력
			System.out.print(">>>");
			String input = scan.nextLine();
			
			// 입력한 단어가 출력된 단어와 일치하는지 체크
			if (wordList.get(randIndex).equals(input)) {
				// 일치한다면 wordList에서 해당 단어를 삭제
				match = true;
				wordList.remove(randIndex);
			}
			// 일치하지 않으면 해당 단어가 삭제되지 않고 또 입력
			
			// 위 과정을 반복 실행 ( wordList에 size가 0이 될 때 까지)
			if(wordList.size() == 0) {
				break;
			}
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println();
		
		// after에서 before를 빼면, 타자를 친 시간이 구해진다. 
		long diff = after - before;
		
		// 초 단위로 변환
		// 31872밀리초 -> 31.872초 
		double result = diff / 1000.0;
		System.out.println(result + "초 결리셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
