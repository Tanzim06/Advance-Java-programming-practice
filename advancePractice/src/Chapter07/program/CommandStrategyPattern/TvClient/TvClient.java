package Chapter07.program.CommandStrategyPattern.TvClient;

public class TvClient {

	public static void main(String[] args) {
		Tv tv= new Tv();
		
		 //Command onCommand= new OnCommand(tv);
		 //Command offCommand= new OffCommand(tv);
		 
		 RemoteControl reomoteControl= new RemoteControl();
		 //reomoteControl.press(onCommand);
		 //reomoteControl.press(offCommand);
		 
		 //by lambda expration
		 //reomoteControl.press(()->tv.switchOn());
		 //reomoteControl.press(()->tv.switchOff());
		 
		 reomoteControl.press(tv::switchOn);
		 reomoteControl.press(tv::switchOff);
	}

}
