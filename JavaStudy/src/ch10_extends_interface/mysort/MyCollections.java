package ch10_extends_interface.mysort;

import java.util.ArrayList;

import ch09_class.school.Student;

public class MyCollections {
	
	
	// 어떤 타입이 올지 모를 때 사용하는 제너릭<T>를
	// 사용하는 메소드를 제너릭 메소드라고 하며
	// 제너릭 메소드는 리턴 타입 앞에 제너릭<T>을 추가해준다.
	
	public static <T> void mySort(ArrayList<T> list, MyComparator<T> comparator) {
		for(int k = 0; k < list.size()-1 ; k++) {
			for(int i = 0 ; i < list.size()-k-1; i++) {
				// 조건이 가장 중요한데, 그 조건을 
				// 현재 정의 내릴 수가 업음. (List 안에 어떤 객체가 올지 모르기 때문에)
				// (= 사용자에게 맡겨야 한다.)
				// (= 인터페이스를 만들어 콜백 함수를 넣어줘야 겠다.)
				if(comparator.myCompare(list.get(i), list.get(i+1))) {     
					T temp = list.get(i);
					list.set(i,list.get(i+1));
					list.set(i+1, temp);
				}
			}
		}
	}
}
