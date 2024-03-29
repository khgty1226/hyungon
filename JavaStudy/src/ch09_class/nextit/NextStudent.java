package ch09_class.nextit;

public class NextStudent {
	
	// 학생들의 상태 (state)를 필드 변수로 선언
	// 필드 변수의 값을 꼭 초기화(Init) 하지 않아도 된다.
	
	String name;
	int age;
	int level;
	int exp;
	
	
	// 기본 생성자
	// 클래스 내에 생성자를 별도로 만들지 않으면 생략된 상태로 존재
	// 만약 생성자를 따로 만들어주었다면
	// 생략된 상태로 존재하던 기본 생성자 제거됨
	// but, 기본 생성자 사용을 위해 따로 만들어준다.
	
	// 생성자는 객체가 생성될 때 실행되는 메소드라 봐도 무방하다.
	public NextStudent() {
		System.out.println("기본 생성자로 객체 생성");
	}
	
	
	
	// 생성자 
	// 단축키 [Alt + shift + s]
	// 또는 마우스 우클릭 - source
	// 이후 Generate Constructor using fields 클릭
	
	public NextStudent(String name, int age, int level, int exp) {
		// this. 는 현재 객체를 의미
		this.name = name;
		this.age = age;
		this.level = level;
		this.exp = exp;
	}
	
	public NextStudent(String name, int age) {
		// this. 는 현재 객체를 의미
		this.name = name;
		this.age = age;
		this.level = 1;
		this.exp = 0;
	}
	
//	this();  = 생성자를 의미
	
//	public NextStudent(String name, int age) {
//		// this. 는 현재 객체를 의미
//		this(name, age, 1, 0); 
//	}
	
	
	// toString() 메소드 
	// 단축키 [Alt + Shift + S ] 
	// Generate toString()
	
	@Override
	public String toString() {
		return "넥스트 3월반 [이름=" + name + ", 나이=" + age + ", 레벨=" + level + ", 경험치=" + exp + "]";
	}
	
	
	
	
	
	// 하루가 지나는 이벤트에 대한 메소드
	public void endDay() {
		
		//20~60 사이의 랜덤 숫자 
		
		int rand = (int)(Math.random()*41) + 20 ;
		exp += rand;
		
		System.out.println(name + "씨의 현재 경험치 : " + exp );
		
		if(exp >= 100) {
			System.out.println("레벨업 !!");
			level ++ ;
			System.out.println(name + "씨의 현재 레벨 : " + level );
			
			exp %= 100;
			System.out.println(name + "씨의 현재 경험치 : " + exp );
		}
		System.out.println();
	}



	



	
	
	
	
	
	
	
	
	
}
