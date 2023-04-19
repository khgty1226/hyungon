package ch10_extends_interface.simple.starcraft;

public class HighTemplar extends StarUnit {
	private int mp;
	private int shield;
	
	
	public void tthundreStorm() {
		mp -= 75;
		System.out.println("우르르 쾅쾅 !");
	}
	
	public HighTemplar() {
		this("하이템플러", 0, 60, 0, 50, 150);
	}
	
	public HighTemplar(String name, int damage, int hp, int mp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.mp = mp;
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "HighTemplar [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", mp=" + mp + ", armor=" + getArmor()
				+ ", shield=" + shield + "]";
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}
	
	
}
