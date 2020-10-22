package Chapter07.program.DecoretorPattern.CofeeApp;

public class CoffeeApp {

	public static void main(String[] args) {
		var coffee= new VanillaAlmondExtract(
				new SaltedCaramelFudge(
						new SweetenedMIlk(new CoffeeBean())
				));
		
		System.out.println(coffee.getIngredient());
	}

}
