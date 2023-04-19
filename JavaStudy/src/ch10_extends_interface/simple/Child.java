package ch10_extends_interface.simple;

/* 상속 */

// Child 는 Parent가 가진 필드 변수나 메소드를 가지고 있는 상태
// but, private으로 되어있는건 자식 객체로 접근 X


public class Child extends Parent{
		
	
	
	public Child() {
		super();
	}

	public Child(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Child [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public void sayHello() {
		System.out.println("응애에요");
	}
}