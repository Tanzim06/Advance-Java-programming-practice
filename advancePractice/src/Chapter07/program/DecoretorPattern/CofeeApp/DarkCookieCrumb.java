package Chapter07.program.DecoretorPattern.CofeeApp;

public class DarkCookieCrumb extends CoffeeDecorator {

	public DarkCookieCrumb(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getIngredient() {
		return super.getIngredient()
				+"+ Dark Cookie Crumb";
	}
}
