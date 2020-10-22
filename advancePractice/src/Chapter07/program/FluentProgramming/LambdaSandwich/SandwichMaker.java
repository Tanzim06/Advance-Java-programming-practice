package Chapter07.program.FluentProgramming.LambdaSandwich;

public class SandwichMaker {

	public static void main(String[] args) {
		Sandwich.make(sandwich-> sandwich
				.setBread("White")
				.setMeat("Beef")
				.setCheese("Cheddar")
				.addVegetable("Tomato")
				.addVegetable("Cucumber")
				);

	}

}
