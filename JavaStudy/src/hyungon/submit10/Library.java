package hyungon.submit10;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> bookList = new ArrayList<>();

	private Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		
		for(int i = 0 ; i < strBooks.split(", ").length; i++) {
			bookList.add(new Book(bookList.size()+1 , strBooks.split(",")[i].trim()));
		}
		
	}
	
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	
	public void showBookList() {
		System.out.println("================= 도서 목록 ================");
		
		for(int i = 0 ; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	public void addBook (String title) {
		bookList.add(new Book(bookList.size()+1, title));
	}
	
	public void rentalBook (int no) {
		bookList.get(no-1).setRental(true);
		System.out.println("["+ no + "] " + bookList.get(no-1).getTitle() + " 책을 대여했습니다.");
	}
	
	public void returnBook (int no) {
		bookList.get(no-1).setRental(false);
		System.out.println("["+ no + "] " + bookList.get(no-1).getTitle() + " 책을 반납했습니다.");
	}
	
	public void searchBook (String word) {
		
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(word)) {
				System.out.println(bookList.get(i));
			}
		}
		
	}

}
