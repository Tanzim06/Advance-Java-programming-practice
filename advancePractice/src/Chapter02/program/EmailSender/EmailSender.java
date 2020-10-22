package Chapter02.program.EmailSender;

public class EmailSender {

	public static void main(String[] args) {
		//final variable
		final String banglaMsg= "বাংলাদেশ";
				
		//effectively final
		String englishMsg= "Bangladesh";

				MassageTranslator translator= (String msg) -> {
					
					return banglaMsg.equals(msg) ? englishMsg :"Unknown";
				};
				
				EmailSender emailSender= new EmailSender();
				emailSender.send(translator, "বাংলাদেশ");
			}
			
			public void send(MassageTranslator translator, String message) {
				String translated =translator.translate(message);
				System.out.println("Sending email with translated message "+ translated);
			}

	}

