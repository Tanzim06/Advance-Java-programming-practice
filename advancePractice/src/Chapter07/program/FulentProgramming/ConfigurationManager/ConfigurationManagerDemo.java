package Chapter07.program.FulentProgramming.ConfigurationManager;

public class ConfigurationManagerDemo {

	public static void main(String[] args) {
		
		ConfigurationManager configManager= ConfigurationManager
				.make(configurationManager-> configurationManager
						.setUrl("production.mydatabase.com")
						.setUsername("tanzim")
						.setPassword("1234")
						.addRole("Admin")
						.addRole("Developer")
						);

	}

}
