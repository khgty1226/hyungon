package hyungon.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {

		System.out.println("=====================과제1====================");
		
		Scanner scan = new Scanner(System.in);
		
		String name ="";
		int korScore;
		int engScore;
		int mathScore;
		double avg;
		String grade = "";
		
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>>");
		name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>");
		korScore = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>>");
		engScore = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>>");
		mathScore = Integer.parseInt(scan.nextLine());
		
		avg = ((double)korScore + engScore + mathScore) / 3;
		
		grade = (avg >= 90) ? ("A") : ((avg >= 80) ? ("B") : ("C"));
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + korScore);
		System.out.println("영어: " + engScore);
		System.out.println("수학: " + mathScore);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("등급: " + grade);
		
		
		
		System.out.println("=====================과제2====================");

//	Scanner scan1 = new Scanner(System.in);
//	
//	System.out.println("주민등록번호 뒷자리를 입력하시오");
//	String idBack = scan1.nextLine();
		
		String idBack = "1231476";
		int genderCheck;
		String gender = "";
		
		genderCheck = Integer.parseInt(idBack.substring(0, 1));
		gender = (genderCheck % 2 == 0) ? ("여성") : ("남성");
		
		System.out.println(genderCheck);
		System.out.println(gender);
		
		
		
		
		
		
	}

}
