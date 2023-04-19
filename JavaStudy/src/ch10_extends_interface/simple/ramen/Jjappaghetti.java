package ch10_extends_interface.simple.ramen;

public class Jjappaghetti extends Ramen{
	
	
	public Jjappaghetti(String name, int price) {
		super(name, price);
	}
	
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고, 스프를 넣어 비벼드세요.");
	}
	
}
