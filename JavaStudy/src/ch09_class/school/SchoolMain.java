package ch09_class.school;

import java.util.ArrayList;

import ch09_class.nextit.NextStudent;

public class SchoolMain {

	public static void main(String[] args) {
		// 이름, 국어 영어 수학 평균 점수를 가지는 학생 객체
		
		Student yesl = new Student("예슬", 85, 80, 87);
		System.out.println(yesl.toString());
	
		// 캡슐화 적용
//		System.out.println(yesl.korScore);
		System.out.println(yesl.getKorScore());
		System.out.println(yesl.getAvg());
		
		// 국어 점수 바꾸기
		yesl.setKorScore(93);
		System.out.println(yesl.toString());
		
		Student hyera = new Student("혜라", 90, 80, 87);
		System.out.println(hyera);
		Student yujeong = new Student("유정", 85, 87, 90);
		
		
		System.out.println();
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(yesl);
		stuList.add(hyera);
		stuList.add(yujeong);
		stuList.add(new Student("준호", 80, 82, 77));
		stuList.add(new Student("동욱", 70, 92, 78));
		
		for(int i = 0 ; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n ====================== 정렬 ==================\n");

		for(int k = 0; k < stuList.size()-1 ; k++) {
			for(int i = 0 ; i < stuList.size()-k-1; i++) {
				if(stuList.get(i).getAvg() <= stuList.get(i+1).getAvg()) {     // 오름차순
					Student temp = stuList.get(i);
					stuList.set(i,stuList.get(i+1));
					stuList.set(i+1, temp);
				}
			}
		}
		
		for(int i = 0 ; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
