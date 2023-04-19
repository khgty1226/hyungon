package ch09_class.school;

import ch09_class.commons.UtilClass;

public class Student {
	
	// 1.필드 변수 선언
	// 접근 제어자
	// public : 공개, 프로젝트 내부 어디서든 접근 가능
	// private : 비공개. 현재 클래스 내에서만 접근이 가능
	// (default) : 같은 폴더 내에 있는 클래스에서만 접근이 가능
	
	
	
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	private double avg;
	
	
	// 2. 생성자
	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		setAvg();
	}
	
	// 변경된 점수에 대해 평균을 붙이는 메소드
	private void setAvg() {
		avg = UtilClass.weRound((korScore + engScore + mathScore)/3.0, 1);
	}
	
	
	
	
	// 3. toString() 추가

	@Override
	public String toString() {
		return "[" + name + ", 국어=" + korScore + ", 영어=" + engScore + ", 수학="
				+ mathScore + ", 평균 =" + avg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
		setAvg();
		
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
		setAvg();
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	// private으로 접근을 막은 필드변수에 대해
	// Getters and Setters로 접근을 허용한다.
	// 단축키 [Alt + Shift + S]
	// Generate Getters and Setters
	
	
	
	
}
