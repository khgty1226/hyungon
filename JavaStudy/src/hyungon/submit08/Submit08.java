package hyungon.submit08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Submit08 {

	public static void main(String[] args) {
		
		System.out.println("\n ============================ 문제 1 ========================== \n");
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		
		System.out.println("\n ============================ 문제 2 ========================== \n");
		
		HashMap<String, String> infoMap = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		boolean success = false;
		String id;
		String password;
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		
		
		while(!success) {
		System.out.println("아이디를 입력해주세요");
		System.out.print(">>>");
		id = scan.nextLine();
		
		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>>");
		password = scan.nextLine();
		
		
		success = loginProgram( id, password , infoMap);
		
		System.out.println();
		}
	}
	
	public static boolean loginProgram( String id, String password, HashMap<String, String> infoMap) {
		
		
		if(infoMap.containsKey(id) && infoMap.get(id).equals(password)) {
			System.out.println("로그인 성공! ");
			return true;
		}else if(!infoMap.containsKey(id)) {
			System.out.println("존재하지 않는 아이디입니다.");
			return false;
		}else if(infoMap.containsKey(id) && !(infoMap.get(id).equals(password))) {
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		}
		
		
		return false;
		
	}
	
	
	
	

	public static ArrayList<Integer> makeLotto(){
		Set<Integer> lottoSet = new HashSet<>();
		ArrayList<Integer> lottoList = new ArrayList<>();
		
		while(lottoSet.size() < 6) {
		lottoSet.add((int)(Math.random() * 45) + 1);
		}
		
		for(int value : lottoSet) {
		lottoList.add(value);
		}
		
		for(int i = 0 ; i < lottoList.size(); i ++) {
			for(int j = 0 ; j < lottoList.size()-i-1 ; j ++) {
				if(lottoList.get(j) > lottoList.get(j+1)) {
					int temp = lottoList.get(j);
					lottoList.set(j, lottoList.get(j+1));
					lottoList.set(j+1, temp);
					
					
				}
			}
		}
		
		return lottoList;
		
	}
	
}
