package Chapter07.prrogram.FluentProgrammming.TrainSandwich;

public class SandwichMaker {

	public static void main(String[] args) {
		Sandwich sandwich= new Sandwich()
		.setBread("White")
		.setMeat("Beef")
		.setCheesee("Cheddar")
		.addVegetables("Tomato")     // this type of calling function is called Method Chaining or Train wreck
		.addVegetables("Cucumber")
		.make();

	}

}
