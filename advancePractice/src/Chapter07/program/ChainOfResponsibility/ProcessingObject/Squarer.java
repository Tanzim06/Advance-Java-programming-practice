package Chapter07.program.ChainOfResponsibility.ProcessingObject;

public class Squarer extends ProcessingObject<Integer> {

	@Override
	protected Integer handleWork(Integer input) {
		
		return input * input;
	}
	
	
}
