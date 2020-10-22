package Chapter07.prrogram.FluentProgrammming.TrainSandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	private String bread;
	private String meat;
	private String cheesee;
	private List<String> vegetables= new ArrayList<>();
	
	
	public Sandwich setBread(String bread) {
		this.bread = bread;
		return this;
	}
	public Sandwich setMeat(String meat) {
		this.meat = meat;
		return this;
	}
	public Sandwich setCheesee(String cheesee) {
		this.cheesee = cheesee;
		return this;
	}
	
	public Sandwich addVegetables(String vegetable) {
		this.vegetables.add(vegetable);
		return this;
	}
	
	public Sandwich make() {
		System.out.println("Making a sandwich");
		return this;
	}
	
	
}
