package hyungon.submit06;

public class Submit06 {

	public static void main(String[] args) {
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		
		System.out.println("\n=========================== 문제 1 ================================\n");
		
		int countLee = 0;
		
		for(int i = 0 ; i < nameList.length; i ++) {
			if (nameList[i].substring(0, 1).equals("이")) {
				countLee++;
			}
		}
		System.out.println("이씨 성을 가진 배우가 총 " + countLee + "명 있습니다.");
		
		
		System.out.println("\n=========================== 문제 2 ================================\n");

		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		int maxInt = intArr[0] ;
		int minInt = intArr[0];
		
		for (int i = 0 ; i < intArr.length ; i++) {
			if(intArr[i] > maxInt) {
				maxInt = intArr[i];
			}
			if(intArr[i] < minInt) {
				minInt = intArr[i];
			}
		}
		System.out.println("최댓값 : " + maxInt);
		System.out.println("최솟값 : " + minInt);
		
		
		System.out.println("\n=========================== 문제 3 ================================\n");

		int[] myLotto = makeLotto();
		for(int i = 0 ; i < myLotto.length ; i++) {
			System.out.print(myLotto[i] + " ");
		}
	}

	public static int[] makeLotto(){
		int[] lottoArray = new int[6];
		
		for( int i = 0 ; i < lottoArray.length ; i ++) {    // 랜덤 값 삽입
			lottoArray[i] = (int)(Math.random()* 45) + 1;
		}
		
		for(int i = 0 ; i < lottoArray.length ; i ++) {   // 중복 확인
			int temp = lottoArray[i];
			for(int j = 0 ; j < lottoArray.length ; j++) {
				if (i == j) continue;
				if(temp == lottoArray[j]) {
					lottoArray[j] = (int)(Math.random()* 45) + 1;
				}
			}
		}
		
		for(int i = 0 ; i < lottoArray.length ; i ++) {     // 버블 정렬
			for(int j = 0 ; j < lottoArray.length-i-1 ; j ++) {
				if(lottoArray[j] > lottoArray[j+1]) {
					int temp = lottoArray[j];
					lottoArray[j] = lottoArray[j+1];
					lottoArray[j+1] = temp ;
				}
			}
		}
		
		
		return lottoArray;
	}
	
}
