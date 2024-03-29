package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>();
	
	// 싱글톤 적용
	// why? : 프로젝트 내에서 이 클래스로부터 객체를 딱 하나만 생성 할 목적으로 사용
	
	private BoardDB() {
		boardList.add(new Board(1, "공지사항 필독!", "욕설 금지", "admin"));
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	// 게시글 목록 출력
	public void showBoardList() {
		for(int i = 0 ; i < boardList.size(); i ++) {
			System.out.println(boardList.get(i));
		}
	}
	
	// 게시글 추가
	public void addBoard(Board board) {
		// board 객체 내부 no가 0이 들어있음.
		
		// board 객체 내부 no를 boardList.size() + 1로 변경
		board.setNo(boardList.size() + 1);
		boardList.add(board);
	}
	
	public void selectBoard (int no) {
		// boardList에 존재하는 board객체 중에
		// 파라미터로 들어온 no와 같은 no를 가지는 board객체 찾기
		
		for(int i = 0 ; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				System.out.println("제목 : " + boardList.get(i).getTitle());
				System.out.println("작성자 : " + boardList.get(i).getAuthor());
				System.out.println("====================================");
				System.out.println(boardList.get(i).getContent());
				
				return;
			}
		}
		
		System.out.println("존재하지 않는 글 번호입니다.");
		
		
	}
	
	
}
