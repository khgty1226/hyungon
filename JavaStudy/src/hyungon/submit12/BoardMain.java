package hyungon.submit12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {
	// ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ
	public static void main(String[] args) {
		ArrayList<Board> boardList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		while(loop) {
			
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록  |  2. 글 쓰기  |  3. 종료");
			System.out.print(">>>");
			
			int input = Integer.parseInt(scan.nextLine());
			
			switch(input) {
			case 1:  // 글 목록
				for(int i = 0; i < boardList.size(); i ++) {
					System.out.println("[" + (i+1) + ". | " + boardList.get(i).getTextName() + " | " + boardList.get(i).getTextDate()+ "]");
				}
				break;
			case 2:  // 글 쓰기
				System.out.print("글 제목을 입력해주세요 : ");
				String textName = scan.nextLine();
				System.out.print("글 내용을 입력해주세요 : ");
				String textContent = scan.nextLine();
				
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				
				int textNum = boardList.size()+1;
				String textDate = sdf.format(date);
				
				
				Board board = new Board(textNum, textName, textDate, textContent);
				boardList.add(board);
				
				break;
			default :
				loop = false;
				break;
			}
			
			
			
			
		}
		
		
		
		
		
	
	}

}
