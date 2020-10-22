package Chapter07.program.DecoretorPattern.CofeeApp;

public class VanillaAlmondExtract extends CoffeeDecorator {

	public VanillaAlmondExtract(Coffee coffee) {
		super(coffee);
		
	}
	
	@Override
	public String getIngredient() {
		return super.getIngredient()
				+"+ Vanilla/almond extract";
	}

}
