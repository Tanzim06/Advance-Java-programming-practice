package Chapter07.program.DecoretorPattern.CofeeApp;

import Chapter07.program.DecoretorPattern.CofeeApp.Coffee;

public class CoffeeBean implements Coffee {

	@Override
	public String getIngredient() {
		return "Cofee bean";
	}

}
