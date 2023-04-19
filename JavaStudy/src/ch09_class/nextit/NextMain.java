package ch09_class.nextit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.school.Student;

// main 메소드를 보유하고 있는 클래스 (실행의 주체가 됨)
public class NextMain {
	
	public static void main(String[] args) {
		// 학생 상태 관리
		String changyeonName = "창연";
		int changyeonAge = 30;
		int changyeonLevel = 2;
		int changyeonExp = 80;
		
		// 하루가 지나면 경험치를 얻고 (20~60 random) 
		// 경험치가 100이 넘으면 level 1 올려준다.
		
		int rand = (int)(Math.random()*41) + 20 ;
		changyeonExp += rand;
		
		System.out.println("창연씨의 현재 경험치 : " + changyeonExp );
		
		if(changyeonExp >= 100) {
			System.out.println("레벨업 !!");
			changyeonLevel ++ ;
			System.out.println("창연씨의 현재 레벨 : " + changyeonLevel );
			
			changyeonExp %= 100;
			System.out.println("창연씨의 현재 경험치 : " + changyeonExp );
		}
		
		System.out.println();
		
		String minkiName = "민기";
		int minkiAge = 28;
		int minkiLevel = 3;
		int minkiExp = 70;
		
		// 하루가 지났다.
		rand = (int)(Math.random()*41) + 20 ;
		minkiExp += rand;
		
		System.out.println("민기씨의 현재 경험치 : " + minkiExp );
		
		if(minkiExp >= 100) {
			System.out.println("레벨업 !!");
			minkiLevel ++ ;
			System.out.println("민기씨의 현재 레벨 : " + minkiLevel );
			
			minkiExp %= 100;
			System.out.println("민기씨의 현재 경험치 : " + minkiExp );
		}
		
		
		System.out.println("\n ================================================= \n");
		
		// 클래스를 통한 객체 생성
		NextStudent junho = new NextStudent();
		
		// 클래스에 선언된 필드 변수들을 가지고 있다.
		System.out.println(junho.name);
		System.out.println(junho.age);
		System.out.println(junho.level);
		System.out.println(junho.exp);
		
		// 필드 변수의 값에는 기본적으로 기본값(디폴트)
		// 기본타입 : 숫자 (0)
		// boolean : false
		// 참조타입 : null
		
		// 객체의 필드변수에 값 넣기
		junho.name = "준호";
		junho.age = 30;
		junho.level = 2;
		junho.exp = 30;
		
		System.out.println(junho);
		
		System.out.println(junho.name);
		System.out.println(junho.age);
		System.out.println(junho.level);
		System.out.println(junho.exp);
		
		// 하루가 지났다. 
		rand = (int)(Math.random()*41) + 20 ;
		junho.exp += rand;
		
		System.out.println("준호씨의 현재 경험치 : " + junho.exp );
		
		if(junho.exp >= 100) {
			System.out.println("레벨업 !!");
			junho.level ++ ;
			System.out.println("준호씨의 현재 레벨 : " + junho.level );
			
			junho.exp %= 100;
			System.out.println("준호씨의 현재 경험치 : " + junho.exp );
		}
		
		System.out.println();
		
		// 태윤씨도 추가
		NextStudent taeyoon = new NextStudent();
		taeyoon.name = "taeyoon";
		taeyoon.age = 28;
		taeyoon.level = 3;
		taeyoon.exp = 70;
		
		// 하루가 지났다.
		taeyoon.endDay();
		
		junho.endDay();
		
		System.out.println("\n=====================================================\n");

		// 지혜
		NextStudent jihye = new NextStudent("지혜", 28, 3, 40);
		// 객체를 생성하면서 필드변수의 값을 채우기
		
		System.out.println(jihye.name);
		System.out.println(jihye.age);
		System.out.println(jihye.level);
		System.out.println(jihye.exp);
		
		// 객체의 현재 상태를 한 번에 보기
		// 클래스 내에 toString() 메소드 오버라이딩
		// syso 내에 객체를 넣게되면 toString()의 실행결과 출력
		System.out.println(jihye);
		System.out.println(jihye.toString());   // 동일
		
		
		System.out.println("\n=======================================\n");
		
		// 여러분들의 짝꿍에 대해 객체로 만들어주시는데
		// 레벨과 경험치는 1과 0으로 고정
		
		NextStudent woojoo = new NextStudent("우주", 34, 1, 0);
		NextStudent hyunjin = new NextStudent("현진", 36, 1, 0);
		
		System.out.println(woojoo);
		System.out.println(hyunjin);
		
		NextStudent junha = new NextStudent("준하", 27);
		System.out.println(junha);
		
		System.out.println("\n============================================\n");
		
		// 객체 복사
		// 같은 필드변수 값을 가지는 새로운 객체 생성
//		NextStudent junhaBot = junha;
//		junhaBot.level += 5;
		
//		System.out.println(junhaBot);
		System.out.println(junha);
		// Call by Reference
		
		NextStudent junhaBot = new NextStudent(junha.name, junha.age, junha.level, junha.exp);
		junhaBot.name = "junhaBot";
		System.out.println(junhaBot);
		
		System.out.println("\n============================================\n");
		
		// 하루가 지났다.
		
		jihye.endDay();
		junha.endDay();
		woojoo.endDay();
		hyunjin.endDay();
		junho.endDay();
		taeyoon.endDay();
		
		// 다수의 객체를 다루기 위해서 ArrayList에 담기
		ArrayList<NextStudent> stuList = new ArrayList<>(); 
		
		stuList.add(jihye);
		stuList.add(junha);
		stuList.add(woojoo);
		stuList.add(hyunjin);
		stuList.add(junho);
		stuList.add(taeyoon);
		
		System.out.println("-------------------------------");
		
		for(int i = 0 ; i < stuList.size() ; i++) {
			stuList.get(i).endDay();
		}
		
		System.out.println("-------------------------------");
		
		
		// 향상된 for 문
		for( NextStudent stu :  stuList) {
			stu.endDay();
		}
		
		
		// 굳이 객체를 생성하면서 ArrayList에 담기
		stuList.add(new NextStudent("자영", 25));
		System.out.println(stuList.get(6));
		
		System.out.println(stuList.size());
		
		int day = 0;
		
		for(int i = 0 ; i < 16; i ++) {
			System.out.println("--------------- " + ++day + " 일이 지났습니다 ! --------------");
			for (NextStudent stu : stuList) {
				stu.endDay();
			}
			System.out.println("--------------------------------------------------------------");
		}
		
		
		for(int i = 0 ; i < stuList.size() ; i ++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("----------------- level로 정렬 -----------------------");
		
		// 레벨을 이용하여 정렬하기
		
		// Collection.sort() 는 정렬 기준을 모르면 오류
		
		// 버블 정렬을 이용해보기
		// 변수명 한 번에 바꾸기  [ Alt + Shift + r]
		for(int k = 0; k < stuList.size()-1 ; k++) {
			for(int i = 0 ; i < stuList.size()-k-1; i++) {
				if(stuList.get(i).level <= stuList.get(i+1).level) {     // 오름차순
					NextStudent temp = stuList.get(i);
					stuList.set(i,stuList.get(i+1));
					stuList.set(i+1, temp);
				}
			}
		}
		

		for(int i = 0 ; i < stuList.size() ; i ++) {
			System.out.println(i+1 + "등. " + stuList.get(i));
		}
		
		System.out.println("\n ============================================== \n");
		
		// 정렬 기준을 알려주면 
		// Collentions.sort()를 사용할 수 있다. 
		Collections.sort(stuList, new Comparator<NextStudent>() {

			@Override
			public int compare(NextStudent stuA, NextStudent stuB) {
				return stuA.level - stuB.level;
			}
			
		});
		
		// 람다식으로
		// stuA.level - stuB.level   : 오름차순
		// stuB.level - stuA.level   : 내림차순
		
		Collections.sort(stuList, (stuA, stuB) -> stuA.level - stuB.level);
		
		for(int i = 0 ; i < stuList.size() ; i ++) {
			System.out.println(i+1 + "등. " + stuList.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
