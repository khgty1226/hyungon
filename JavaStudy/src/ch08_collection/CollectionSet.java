package ch08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합 (set)
		
		// HashSet의 선언
		HashSet<String> stuSet = new HashSet<>();
		
		// 다형성
		// List중에 ArrayList가 있음
		List<String> stuList = new ArrayList<String>();

		Set<String> stuSet2 = new HashSet<String>();
		
		stuSet.add("박진영");
		stuSet.add("유동윤");
		stuSet.add("홍민경");
		// 순서x
		// 중복 값 추가 x
		
		System.out.println(stuSet);
		
		stuSet.add("홍민경");
		
		System.out.println(stuSet.size());
		
		System.out.println(stuSet.contains("홍민경"));   // true or false
		
		// Set 조회
		// 1. Iterator 사용
		
		Iterator<String> iter = stuSet.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		// 2. 향상된 for 문 사용
		for(String stu : stuSet) {
			System.out.println(stu);
		}
	
		// 3. forEach 사용
		stuSet.forEach(stu -> System.out.println(stu));
		
		System.out.println("\n==================================================\n");
		
		// set은 집합을 쓰는 경우가 아니라면 잘 쓰지 않는다.
		// 그나마 set을 사용한다면 set의 중복을 허용하지 않는 특징을 이용하는 경우
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		// 15부터 30 사이의 랜덤 숫자를 10개 담기
		
		for(int i = 0 ; i < 10 ; i++) {
		int rand = (int)(Math.random() *16) +15;
		intList.add(rand);
		}
		
		System.out.println(intList);
		
		//ArrayList인 intList를 HashSet에 옮기기
		
		HashSet<Integer> intSet = new HashSet<>();
		intSet.addAll(intList);
		
		// 그대로 복사 + 중복제거
		System.out.println(intSet);
		
		// HashSet의 값을 ArrayList로 옮기기
		intList.clear();
		intList.addAll(intSet);
		System.out.println(intList);
		
		
		// 당연하게도 for문을 이용해서 옮길 수 있다.
		intList.clear();
		for(int num : intSet){
			intList.add(num);
		}
		
		System.out.println(intList);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
