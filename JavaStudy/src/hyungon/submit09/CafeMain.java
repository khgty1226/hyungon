package hyungon.submit09;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("카푸치노", 6000));
		starBucks.addCoffee(new Coffee("오곡라떼", 7000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("바닐라라떼", 3000));
		conte.addCoffee(new Coffee("아이스티", 3500));
		
		
		System.out.println(starBucks);
		System.out.println(conte);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.println("어서오세요. 스타벅스입니다.");
				System.out.println("메뉴판");
				
				for(int i = 0; i < starBucks.getCoffeeList().size(); i++) {
				System.out.println((i+1) + ". " + starBucks.getCoffeeList().get(i).getName() + " : " + starBucks.getCoffeeList().get(i).getPrice());
				}
				
				System.out.println("메뉴를 선택해주세요.");
				
				select = Integer.parseInt(sc.nextLine());
				
				System.out.println(starBucks.getCoffeeList().get(select-1).getName() + " 한 잔 " + starBucks.getCoffeeList().get(select-1).getPrice() + "원에 구매하였습니다.");
				continue;
				
			}else if(select == 2) {
				System.out.println("어서오세요. 꽁떼입니다.");
				System.out.println("메뉴판");
				
				for(int i = 0; i < conte.getCoffeeList().size(); i++) {
				System.out.println((i+1) + ". " + conte.getCoffeeList().get(i).getName() + " : " + conte.getCoffeeList().get(i).getPrice());
				}
				
				System.out.println("메뉴를 선택해주세요.");
				
				select = Integer.parseInt(sc.nextLine());
				
				System.out.println(conte.getCoffeeList().get(select-1).getName() + " 한 잔 " + conte.getCoffeeList().get(select-1).getPrice() + "원에 구매하였습니다.");
				continue;
				
			} else if (select == 3) {
				System.out.println("일 하러 갑시다....");
				break;
			}
			
		}

	}

}
