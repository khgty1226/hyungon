package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	
//	1. 본인의 생성자 -> 비공개
	private MovieDB() {
		movieList.add(new Movie("신세계" , "거 죽기 딱 좋은 날씨네" , "이정재 / 황정민 / 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의 전쟁" , "느그 서장 남천동 살제?" , "하정우 / 최민식 / 조진웅 / 마동석", "ㅂㅈㅇㅇ ㅈㄴ"));
		movieList.add(new Movie("어벤져스 엔드게임" , "어벤져스 어셈블" , "아이언맨 / 타노스 / 캡틴마블", "ㅇㅂㅈㅅ ㅇㄷㄱㅇ"));
		movieList.add(new Movie("부당거래" , "호의가 계속되면 그게 권리인 줄 알아" , "류승범 황정민 유해진", "ㅂㄷㄱㄹ"));
		movieList.add(new Movie("아저씨" , "아직 한 발 남았다" , "원빈 김새론 김희원", "ㅇㅈㅆ"));
		movieList.add(new Movie("기생충" , "가장 완벽환 계획이 뭔지 알아? 무계획이야" , "송강호 이선균 최우식 박소담", "ㄱㅅㅊ"));
		movieList.add(new Movie("베테랑" , "어이가 없네" , "황정민 유아인", "ㅂㅌㄹ"));
		movieList.add(new Movie("파수꾼" , "너만 알아주면 돼" , "이제훈 박정민", "ㅍㅅㄲ"));
		movieList.add(new Movie("레옹" , "항상 그렇단다" , "레옹 마틸다", "ㄹㅇ"));
		movieList.add(new Movie("사도" , "허공으로 날아간 저 화살이 얼마나 떳떳하더냐" , "유아인 송강호", "ㅅㄷ"));
	}
	
	// 생성자가 비공개이니 클래스 내에 직접 선언
	// 접근할 수 있게 static
	// 그러나 수정은 불가하게 private
	
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
}
