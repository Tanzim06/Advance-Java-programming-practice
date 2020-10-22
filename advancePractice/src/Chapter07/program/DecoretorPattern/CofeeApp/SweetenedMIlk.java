package Chapter07.program.DecoretorPattern.CofeeApp;

public class SweetenedMIlk extends CoffeeDecorator {

	public SweetenedMIlk(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getIngredient() {
		return super.getIngredient()
				+"+ Sweetened Milk";
	}
}
