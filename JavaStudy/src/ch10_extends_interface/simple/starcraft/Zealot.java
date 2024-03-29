package ch10_extends_interface.simple.starcraft;

public class Zealot extends StarUnit {
	private int shield;
	

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + ", shield=" + shield
				+ "]";
	}

	public Zealot() {
		this("질럿", 16, 100, 1, 60);
	}
	
	public Zealot(String name, int damage, int hp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.shield = shield;
	}
	
	
	
}
