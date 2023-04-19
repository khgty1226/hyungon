package ch09_class.homepage;

import java.util.Scanner;

public class HomepageMain {

	public static void main(String[] args) {
		// 회원가입, 로그인
		// 회원 :  학번, 아이디, 비밀번호, 이름
		
		MemberDB memDB = MemberDB.getinstance();
		memDB.showMemList();
		
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("행동을 선택해주세요. ");
			System.out.println("1. 회원가입   |   2. 로그인   |   3. 회원 목록   |   4. 종료  ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				//TODO 회원가입
				System.out.println("아이디를 입력해주세요");
				System.out.println(" >>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요.");
				System.out.println(" >>> ");
				String pw = scan.nextLine();
				
				System.out.println("이름을 입력해주세요.");
				System.out.println(" >>> ");
				String name = scan.nextLine();
				
				Member mem = new Member(memDB.makeStuId(), id, pw, name);
				memDB.registMember(mem);
				
			}else if(command == 2) {
				//TODO 로그인
				System.out.println("아이디를 입력해주세요");
				System.out.println(" >>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요.");
				System.out.println(" >>> ");
				String pw = scan.nextLine();
				
				// memDB 객체의 memList에서
				// 입력한 id와 pw 일치하는 Member 객체를
				// 찾아서 해당 Member객체를 리턴
				
				
				Member login = memDB.login(id, pw);
				
				while (true) {
					// 게시물 목록 출력
					
					boardDB.showBoardList();
					
					System.out.println("행동을 선택해주세요");
					System.out.println("1. 글쓰기 | 2. 글 조회 | 3. 로그아웃");
					System.out.print(">>>");
					
					int select = Integer.parseInt(scan.nextLine());
					
					if(select == 1) {
						//TODO 글쓰기
						System.out.println("글 제목을 입력해주세요");
						System.out.print(">>>");
						String title = scan.nextLine();

						System.out.println("글 내용을 입력해주세요");
						System.out.print(">>>");
						String content = scan.nextLine();
						
						Board board = new Board(0, title, content, login.getId());
						boardDB.addBoard(board);
						
					}else if(select == 2) {
						//TODO 글 조회
						
						System.out.println("글 번호를 입력해주세요");
						System.out.print(">>>");
						
						int no = Integer.parseInt(scan.nextLine());
						
						boardDB.selectBoard(no);
					}else {
						//TODO 로그아웃
						break;
					}
					
					
				}
				
			}else if(command == 3) {
				//TODO 회원 목록
				memDB.showMemList();
			}else {
				// 종료
				System.out.println("종료");
				break;
			}
			
		}
		
		
		
	}

}
