package Chapter07.program.FulentProgramming.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConfigurationManager {
	
	private String url;
	private String username;
	private String password;
	private List<String> roleList= new ArrayList<>();
	
	public ConfigurationManager() {
		
	}

	public ConfigurationManager setUrl(String url) {
		this.url = url;
		return this;
		
	}

	public ConfigurationManager setUsername(String username) {
		this.username = username;
		return this;
	}

	public ConfigurationManager setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public ConfigurationManager addRole(String Role) {
		this.roleList.add(Role);
		return this;
	}
	
	public static ConfigurationManager make(Consumer<ConfigurationManager> consumer) {
		System.out.println("Making a configurationManager");
		ConfigurationManager confManager= new ConfigurationManager();
		consumer.accept(confManager);
		return confManager;
	}
	
	
}
