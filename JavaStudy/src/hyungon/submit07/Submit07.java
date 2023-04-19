package hyungon.submit07;

import java.util.ArrayList;

public class Submit07 {

	public static void main(String[] args) {
		
		System.out.println("\n======================= 문제 1-1 ======================\n");
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		for (int i = 0 ; i < 10 ; i ++) {
			intList.add((int)(Math.random()*11) + 10);
		}
		
		System.out.println(intList);
		
		System.out.println("\n======================= 문제 1-2 ======================\n");

		
		ArrayList<Integer> disIntList = new ArrayList<>();
		
//		// 중복검사
//		for(int i = 0 ; i < intList.size() ; i ++) {
//			for ( int j = 0 ; j < intList.size(); j ++) {
//				if(i == j) continue;
//				else {
//					if(intList.get(i) == intList.get(j)) {
//						intList.remove(j);
//					}
//				}
//			}
//			disIntList.add(intList.get(i));
//		}
		
		for(int i = 0 ; i < intList.size(); i ++) {
			if(!disIntList.contains(intList.get(i))) {
				disIntList.add(intList.get(i));
			}
		}
		
		System.out.println(disIntList);
		
		System.out.println("\n======================= 문제 1-3 ======================\n");
		
		for(int i = 0 ; i < disIntList.size(); i ++) {
			for(int j = 0; j < disIntList.size()-1 ; j ++) {
				if(disIntList.get(j) > disIntList.get(j+1)) {
					int temp = disIntList.get(j);
					disIntList.set(j, disIntList.get(j+1));
					disIntList.set(j+1, temp);
				}
			}
		}
		
		System.out.println(disIntList);
		
		System.out.println("\n======================= 문제 1-4 ======================\n");
		
		for(int i = 0 ; i < disIntList.size(); i ++) {
			for(int j = 0; j < disIntList.size()-1 ; j ++) {
				if(disIntList.get(j) < disIntList.get(j+1)) {
					int temp = disIntList.get(j);
					disIntList.set(j, disIntList.get(j+1));
					disIntList.set(j+1, temp);
				}
			}
		}
		
		System.out.println(disIntList);
		
		
		System.out.println("\n======================= 문제 2 ======================\n");
		
		ArrayList<String> wifeList = new ArrayList<>();
		ArrayList<String> husList = new ArrayList<>();
		
		wifeList.add("냉장고");
		wifeList.add("로봇청소기");
		wifeList.add("세탁기");
		wifeList.add("에어컨");
		
		husList.add("노트북");
		husList.add("TV");
		husList.add("에어컨");
		husList.add("플레이스테이션");
		husList.add("로봇청소기");

		ArrayList<String> sameList = new ArrayList<>();
		
		for(int i = 0 ; i < wifeList.size(); i++) {
			if(husList.contains(wifeList.get(i))) {
				sameList.add(wifeList.get(i));
			}
		}
		
		System.out.println(sameList);
		
		ArrayList<String> totalList = new ArrayList<>();
		
		for(int i = 0 ; i < husList.size(); i++) {
			if(wifeList.contains(husList.get(i))) {
				totalList.add(husList.get(i));
			}else {
				totalList.add(husList.get(i));
			}
		}
		
		System.out.println(totalList);
		
	}

}
