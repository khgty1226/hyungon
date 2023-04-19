package hyungon.submit01;

public class Submit01 {

	public static void main(String[] args) {
		
		System.out.println("\n====================과제1====================\n");

		
		String name = "김현곤";
		int age = 29;
		float height = 178.7f;
		String phone = "010-7358-4002";
		String email = "khgty1226@naver.com";
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		System.out.println("연락처:" + phone);
		System.out.println("이메일:" + email);
		
		
		System.out.println("\n=====================과제2===================\n");
		
		
		
		String enigma = "너오구늘리뭐너먹구지리";
		
		enigma = enigma.replace("너", "");
		System.out.println("1차 암호 해독[너 제거]: " + enigma );
		
		enigma = enigma.replace("구", "");
		System.out.println("2차 암호 해독[구 제거]: " + enigma );
		
		enigma = enigma.replace("리", "");
		System.out.println("3차 암호 해독[리 제거]: " + enigma );
		
		System.out.println("해독완료!! ->" + enigma);
		System.out.println(enigma);
		
		
		
		System.out.println("\n=====================과제3===================\n");
	
		int example = 278;
		String strTest;
		
		
		strTest = Integer.toString(example);
		int ex_1 = Integer.parseInt(strTest.substring(0,1));
		
		strTest = Integer.toString(example);
		int ex_2 = Integer.parseInt(strTest.substring(1,2));
		
		strTest = Integer.toString(example);
		int ex_3 = Integer.parseInt(strTest.substring(2,3));
		
		
		
		System.out.println("결과는 : " + (ex_1 + ex_2 + ex_3));
		
		
		
		System.out.println("\n=====================과제4===================\n");
		
		// 과제3 한 줄로 끝내기
		int example2 = 278;
		String strTest2 = Integer.toString(example);
		
		
		System.out.println("결과는 : " + (Integer.parseInt(strTest.substring(0,1)) 
				+ Integer.parseInt(strTest.substring(1,2)) 
				+ Integer.parseInt(strTest.substring(2,3))));
		
	}

}
