package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	
	public static final int OPTION_STUDENT_NAME = 0;
	public static final int OPTION_CODINT_WORD = 1;
	public static final int OPTION_RANDOM_ALPHABET = 2;
	
	
	
	
	
	
	
	
	/**
	 * 단어목록을 만들어서 리턴해주는 메소드
	 * @param option
	 * @return
	 */
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> wordList = new ArrayList<>();
		
		if(option == OPTION_STUDENT_NAME) {
		wordList.add("장유정");
		wordList.add("배준호");
		wordList.add("고동욱");
		wordList.add("박혜라");
		wordList.add("정현진");
		wordList.add("홍민경");
		wordList.add("박진영");
		wordList.add("김대일");
		wordList.add("박창연");
		wordList.add("최성복");
		wordList.add("이자영");
		wordList.add("백민기");
		wordList.add("유동윤");
		wordList.add("강지혜");
		wordList.add("김태윤");
		wordList.add("박준하");
		wordList.add("주예슬");
		wordList.add("윤종현");
		wordList.add("류서영");
		wordList.add("신경호");
		wordList.add("김청아");
		wordList.add("김현곤");
		}else if(option == OPTION_CODINT_WORD) {
			wordList.add("Class");
			wordList.add("Static");
			wordList.add("while");
			wordList.add("method");
			wordList.add("public");
			wordList.add("Constructor");
			wordList.add("forEach");
			wordList.add("Scanner");
		}else if(option == OPTION_RANDOM_ALPHABET) {
			// 랜덤 알파벳으로 이루어진 단어 출력
			// agsdff
			// rbdfgr
			String[] alphabet = "qertyuiopasdfghjklzxcvbnm".split("");
			
			// 6자리의 랜덤 알파벳으로 이루어진 문자열 생성 후 
			// wordList에 담기 
			
//			for(int i = 0 ; i < alphabet.length; i ++) {
//				System.out.println(alphabet[i]);
//			}
			
			for(int j = 0 ; j < 10 ; j++) {  // 10개 담기
			String word = "";
			for(int i = 0 ; i < 6 ; i ++) {
			int randIdx = (int)(Math.random() * alphabet.length);
			word += alphabet[randIdx];
			}
			wordList.add(word);
			}
			
			
			
			
		}
		
		return wordList;
	}
}
