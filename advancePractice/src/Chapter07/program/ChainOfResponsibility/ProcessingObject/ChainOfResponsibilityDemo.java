package Chapter07.program.ChainOfResponsibility.ProcessingObject;

import java.util.function.UnaryOperator;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
		/*ProcessingObject<Integer> squarer= new Squarer();
		ProcessingObject<Integer> incrementer= new Incrementer();
		
		squarer.setSuccessor(incrementer);
		Integer result= squarer.handle(4);
		
		System.out.println(result);  */
		
		
		UnaryOperator<Integer> squarer= a -> a*a;
		UnaryOperator<Integer> incrementer= a -> a+1;
		
		Integer result= squarer.andThen(incrementer).apply(4);
		System.out.println(result);

	}

}
