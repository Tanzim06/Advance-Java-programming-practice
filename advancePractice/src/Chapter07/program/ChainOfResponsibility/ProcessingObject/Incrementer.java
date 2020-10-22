package Chapter07.program.ChainOfResponsibility.ProcessingObject;

public class Incrementer extends ProcessingObject<Integer> {

	@Override
	protected Integer handleWork(Integer input) {
		return input +1;
	}
	
	
}
