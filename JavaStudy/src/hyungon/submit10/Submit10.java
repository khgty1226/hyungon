package hyungon.submit10;

import java.util.Scanner;

public class Submit10 {

	public static void main(String[] args) {
		Library bookDB = Library.getInstance();
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.println(" 1. 책 입고  |  2. 책 대여  |  3. 책 목록 조회  |  4. 책 검색  |  5. 종료");
			System.out.print(">>>");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				//TODO 책 입고
				System.out.println();
				System.out.println("- 책 입고 -");
				System.out.println(" 책 제목을 입력해주세요");
				System.out.print(">>>");
				
				String title = scan.nextLine();
				bookDB.addBook(title);
				
				System.out.println();
				
			}else if( select == 2) {
				//TODO 책 대여
				System.out.println("- 책 대여 -");
				System.out.println("대여할 책 번호를 입력해주세요.");
				System.out.print(">>>");
				
				int no = Integer.parseInt(scan.nextLine());
				
				bookDB.rentalBook(no);
				
			}else if( select == 3 ) {
				//TODO 책 목록 조회
				
				bookDB.showBookList();
				
				System.out.println();
				
			}else if( select == 4) {
				//TODO 책 검색
				
				System.out.println();
				System.out.println("- 책 검색 -");
				
				System.out.println("검색어를 입력해주세요");
				System.out.print(">>>");
				String word = scan.nextLine();

				bookDB.searchBook(word);
				
			}else {
				//TODO 종료
				break;
			}
			
			
		}
		
	}

}
