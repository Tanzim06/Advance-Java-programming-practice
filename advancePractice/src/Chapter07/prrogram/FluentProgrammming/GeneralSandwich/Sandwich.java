package Chapter07.prrogram.FluentProgrammming.GeneralSandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	private String bread;
	private String meat;
	private String cheesee;
	private List<String> vegetables= new ArrayList<>();
	
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setCheesee(String cheesee) {
		this.cheesee = cheesee;
	}
	
	public void addVegetables(String vegetable) {
		this.vegetables.add(vegetable);
	}
	
	public void make() {
		System.out.println("Making a sandwich");
	}
	
	
}
