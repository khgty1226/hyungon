package ch08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// 맵 (HashMap)의 선언 
		// key와 Value의 한 쌍인 데이터를 저장
		
		HashMap<String, String> stuMap = new HashMap<>();
		
		// 다형성 이용
		Map<String, Integer> coinMap = new HashMap<>();
		
		
		stuMap.put("첫째", "예슬");
		stuMap.put("둘째", "종현");
		stuMap.put("셋째", "서영");

		System.out.println(stuMap);

		stuMap.put("첫째", "경호");
		
		System.out.println(stuMap);
		
		// 순서는 보장하지 않는다.
		// 중복된 key값을 추가하게 되면 기존 value를 덮어쓴다.
		// ( key에 대한 value를 수정하는 경우 put을 이용하면 된다.
		
		
		coinMap.put("비트코인", 36000000);
		coinMap.put("도지코인", 123);
		System.out.println(coinMap);
		
		
		System.out.println("\n ================================================= \n");
		
		// .get(key)
		// key에 대한 value를 리턴
		
		System.out.println(stuMap.get("첫째"));
		
		// 존재하지 않는 key값을 입력하면 ?
		System.out.println(stuMap.get(10));
		// null
		
		// .size()
		System.out.println(stuMap.size());
		
		// .containsKey(값)
		// Map 안에 있는 키(key)중에 괄호 안 값이 있는지
		// true or false
		
		System.out.println(stuMap.containsKey("첫째"));
		
		// .containsValue(값)
		// Map 안에 있는 Value 중에 괄호 안 값이 있는지
		// true or false
		
		System.out.println(stuMap.containsValue("종현"));
		
		// .remove(key)
		coinMap.remove("도지코인");
		System.out.println(coinMap);
		
		System.out.println("\n ============================================= \n");
		
		// Map 순회
		// 1. keySet 이용
		Set<String> keySet = stuMap.keySet();
		
		// 향상된 for문으로 set순회
		for (String key : keySet) {
			System.out.println(key);
			System.out.println(stuMap.get(key));
		}
		
		System.out.println();
		
		// 2. entrySet 이용
		Set<Entry<String, String>> entrySet= stuMap.entrySet();
		
		// 향상된 for문 사용
		for( Entry<String, String> entry :  entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println();
		
		// 3. forEach(람다식)
		stuMap.forEach((key, value) -> System.out.println(key + " : " + value));
		
		
		
		
		
		
		
		
	}

}
