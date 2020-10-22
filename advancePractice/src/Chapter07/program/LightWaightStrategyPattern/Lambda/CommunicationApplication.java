package Chapter07.program.LightWaightStrategyPattern.Lambda;

public class CommunicationApplication {

	public static void main(String[] args) {
		var communicationService= new CommunicationService();
		
		communicationService.setCommunicable((destination, message)->"Communicating via Email->sending message to "
				+"destination : ["+ destination +"], message["+ message +"]");
		
		communicationService.sendMessage("contact@bazlur.com", "Hello World!");
		
		communicationService.setCommunicable((destination, message)->"Communicating via PhoneCall->sending message to "
				+"destination : ["+ destination +"], message["+ message +"]");
		
		communicationService.sendMessage("+88016718xxxx", "Hello World");
		
		communicationService.setCommunicable((destination, message)->"Communicating via VedioCall->sending message to "
				+"destination : ["+ destination +"], message["+ message +"]");
		
		communicationService.sendMessage("contact@bazlur.com", "Hi there! lets do a video chat");

	}

}
