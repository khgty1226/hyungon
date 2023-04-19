package hyungon.submit09;

import java.util.ArrayList;

public class Cafe {
	private String name;
	private ArrayList<Coffee> coffeeList = new ArrayList<>();
	
	
	public Cafe(String name) {
		this.name = name;
	}

	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Coffee> getCoffeeList() {
		return coffeeList;
	}


	public void setCoffeeList(ArrayList<Coffee> coffeeList) {
		this.coffeeList = coffeeList;
	}


	@Override
	public String toString() {
		return "Cafe [name=" + name + ", coffeeList=" + coffeeList + "]";
	}
	
	
	public void addCoffee(Coffee menu) {
		this.coffeeList.add(menu);
	}
	
	
	
}
