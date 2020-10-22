package Chapter07.program.DecoratorPattern.Lambda;

@FunctionalInterface
public interface Coffee {
	
	String getIngredient();
	
	static Coffee withSaltedCaramelFudge(Coffee coffee) {
		return ()->coffee.getIngredient() +" +Salted caramel fudge";
	}
	
	static Coffee withSweetenedMilk(Coffee coffee) {
		return ()->coffee.getIngredient() +" + Sweetened Milk";
	}
	
	static Coffee withDarkCookieCrumb(Coffee coffee) {
		return ()->coffee.getIngredient()+" + Dark Cookie Crumb";
	}
	
	static Coffee withVanillAlmondExract(Coffee coffee) {
		return ()->coffee.getIngredient()+" + Vanilla/almond extract";
	}
}
