package Chapter07.program.DecoratorPattern.Lambda;

import java.util.function.Function;
import java.util.stream.Stream;

public class CoffeeDecoratorUsingLambda  {
	/*public static Coffee getCoffeeWithExtras(Coffee coffee, Function<Coffee, Coffee>...ingradiants) {
		
		Function<Coffee, Coffee> initial= kopi->kopi;
		
		for(Function<Coffee, Coffee> ingradiant: ingradiants) {
			initial= initial.andThen(ingradiant);
		}
		
		return initial.apply(coffee);
	}*/
	
	
	
	// using reduce() function and method refarence
	public static Coffee getCoffeeWithExtras(Coffee coffee, Function<Coffee, Coffee>...ingradiants) {
		Function <Coffee, Coffee> reduced= Stream.of(ingradiants).reduce(Function.identity(), Function::andThen);
		return reduced.apply(coffee);
	}

}
