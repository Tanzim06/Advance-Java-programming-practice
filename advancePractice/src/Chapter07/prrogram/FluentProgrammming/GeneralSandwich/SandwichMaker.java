package Chapter07.prrogram.FluentProgrammming.GeneralSandwich;

public class SandwichMaker {

	public static void main(String[] args) {
		Sandwich sandwich= new Sandwich();
		sandwich.setBread("White");
		sandwich.setMeat("Beef");
		sandwich.setCheesee("Cheddar");
		sandwich.addVegetables("Tomato");
		sandwich.addVegetables("Cucumber");
		
		sandwich.make();

	}

}
