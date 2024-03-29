package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PlayMap {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시", "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인", "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진", "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa", "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식", "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스", "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		
		System.out.println();
		
		HashMap<String, String> playMap = new HashMap<>();
		
		// playMap에 key값은 노래제목, value값은 가수명이 되도록 데이터를 담아보세요
		for(int i = 0 ; i < playList.size(); i++) {
		playMap.put(playList.get(i).split(": ")[0], playList.get(i).split(": ")[1]);
		}
		
		System.out.println(playMap);
		
		Set<String> keySet = playMap.keySet();
		
		System.out.println();
		
		for( String key : keySet) {
			System.out.println(key + " - " + playMap.get(key));
		}
		
		System.out.println("\n=========================================\n");
		
		// 검색
		searchMap("제목", "사랑", playMap);
		
		searchMap("가수", "아이유", playMap);
		
		System.out.println("\n=========================================\n");

		
		// 아이유의 노래 목록 만들고
		// 태연의 노래 목록 만들고
		// 임영웅의 노래 목록 만들어서
		
		// 아이유 : [블루밍, 스트로베리 .....]   (ArrayList)
		// 태연 : [불티... 만약에 ...]
		// 임영웅 : [ 사랑은 늘 도망가 , ... .]
		
		// HashMap <String, ArrayList<String>>
		
		ArrayList<String> iuSongs = makeSongList("아이유", playList);
		System.out.println(iuSongs);
		
		HashMap<String, ArrayList<String>> singerMap = new HashMap<>();
		singerMap.put("아이유", iuSongs);
		singerMap.put("태연", makeSongList("태연", playList));
		singerMap.put("임영웅", makeSongList("임영웅", playList));
		
		System.out.println(singerMap);
		
		Set<String> keys = singerMap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + singerMap.get(key));
		}
	}
	
	// 가수 이름을 넣으면 가수의 노래 목록 ( ArrayList<String> ) 으로 리턴하는 메소드
	
	public static ArrayList<String> makeSongList(String name, ArrayList<String> playList){
		ArrayList<String> songList = new ArrayList<>();
		
		for(int i = 0 ; i < playList.size() ; i ++) {
			if (playList.get(i).split(": ")[1].equals(name)) {
				songList.add(playList.get(i).split(": ")[0]);
			}
		}
		
		return songList;
	}
	
	
	
	public static void searchMap(String option, String keyword, HashMap<String, String> playMap){
		// playMap을 순회
		// keySet을 이용
		Set<String> keySet = playMap.keySet();
		
		for(String key : keySet) {
			if(option.equals("제목")) {
				// Key값 중에 keyword를 포함하고 있는 데이터 체크
				if(key.contains(keyword)){
					System.out.println(key + " : " + playMap.get(key));
				}
			}else if (option.equals("가수")) {
				// Value 중에 keyword를 포함하고 있는 데이터 체크
				if(playMap.get(key).contains(keyword)) {
					System.out.println(key + " : " + playMap.get(key));
				}
			}
		}
	}
	

}
