package ch09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memList = new ArrayList<>();
	
	
	// 싱글톤 패턴 적용
	// 1. 기본 생성자의 접근 제어자를 private으로 막는다. 

	private MemberDB() {
		// 기본 생성자에 실행구문 추가
		memList.add(new Member ("2023023001", "a001", "123a", "배준호"));
		memList.add(new Member ("2023023002", "b001", "123b", "고동욱"));
		memList.add(new Member ("2023023003", "c001", "123c", "홍민경"));
		
	}
	
	// 2. 필드변수에 자기자신 객체를 소환한다.
	// static을 붙여주어야 다른 클래스에서 이 객체를 소환하지 않고 접근할 수 있다.
	// 접근 후 직접적으로 수정할 수 없게 private 처리
	
	private static MemberDB instance = new MemberDB();
	
	// 3. instance에 대한 Getter 생성
	public static MemberDB getinstance() {
		return instance;
	}
	
	
	// 회원 목록 조회
	public void showMemList() {
		for(int i = 0 ; i < memList.size(); i ++) {
			System.out.println(memList.get(i));
		}
	}
	
	// 학번 생성
	public String makeStuId() {
		return "202302300" + (memList.size()+1);
	}
	
	// 회원가입
	public void registMember(Member mem) {
		// 파라미터로 들어온 mem 객체에 대해서
		// mem.getId() 가 memList.get(i).getId()와 같은게 있다면
		// id 가 중복되므로 회원가입 불가
		
		for(int i = 0 ; i < memList.size(); i++) {
			if(mem.getId().equals(memList.get(i).getId())) {
				System.out.println("중복된 아이디입니다.");
				return;
			}
		}
		
		memList.add(mem);
	}
	
	// 로그인
	public Member login (String id, String password) {
		for(int i = 0 ; i < memList.size(); i++) { 
			if(memList.get(i).getId().equals(id)) {
				System.out.println(memList.get(i).getPassword());
				if(memList.get(i).getPassword().equals(password)) {
					return memList.get(i);
				}else {
					System.out.println("비밀번호가 틀립니다 !");
					return null;
				}
			}	
		}
		System.out.println("아이디가 존재하지 않습니다.");
		return null;
	}
	
	
	
	
}
