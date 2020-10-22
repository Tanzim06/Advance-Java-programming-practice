package Chapter07.program.DecoretorPattern.CofeeApp;

import Chapter07.program.DecoretorPattern.CofeeApp.Coffee;

public abstract class CoffeeDecorator implements Coffee {
	private final Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getIngredient() {
		
		return coffee.getIngredient();
	}
	
	

}
