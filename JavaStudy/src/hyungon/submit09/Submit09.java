package hyungon.submit09;

import java.util.ArrayList;
import java.util.Collection;

import ch09_class.school.Student;

public class Submit09 {

	public static void main(String[] args) {
		
		Product product1 = new Product("냉장고", 2000000);
		Product product2 = new Product("TV", 1000000);
		Product product3 = new Product("에어컨", 800000);
		Product product4 = new Product("컴퓨터", 1300000);
		Product product5 = new Product("선풍기", 100000);
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		
		for(int i = 0 ; i < products.size(); i ++) {
			System.out.println(products.get(i));
		}
		
		System.out.println("\n ================= 정렬 =================\n ");
		
		for(int k = 0; k < products.size()-1 ; k++) {
			for(int i = 0 ; i < products.size()-k-1; i++) {
				if(products.get(i).getPrice() >= products.get(i+1).getPrice()) {     // 오름차순
					Product temp = products.get(i);
					products.set(i,products.get(i+1));
					products.set(i+1, temp);
				}
			}
		}
		
		for(int i = 0 ; i < products.size(); i ++) {
			System.out.println(products.get(i));
		}
		
		System.out.println("\n =========================================\n");
		
		for(int i = 0 ; i < products.size(); i++) {
			if (products.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
	}

}
