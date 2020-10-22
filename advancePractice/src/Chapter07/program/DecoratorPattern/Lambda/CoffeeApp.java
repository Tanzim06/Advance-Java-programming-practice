package Chapter07.program.DecoratorPattern.Lambda;


public class CoffeeApp{

	public static void main(String[] args) {
		var coffee= CoffeeDecoratorUsingLambda.getCoffeeWithExtras (()->"Main Ingradiante",
				
				Coffee::withDarkCookieCrumb,
				Coffee::withSweetenedMilk,
				Coffee::withVanillAlmondExract
				);
		
		System.out.println(coffee.getIngredient());
	}
}
