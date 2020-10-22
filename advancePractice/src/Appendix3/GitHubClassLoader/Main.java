package Appendix3.GitHubClassLoader;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {
		 
		var url= "https://github.com/rokon12/Person.class/blob/master/src/com/bazlur/dc/Person.class?raw=true";
		
		try {
			var parentClassLoader= GithubClassLoader.class.getClassLoader();
			
			var githubClassLoader= new GithubClassLoader(parentClassLoader);
			
			var personClass= githubClassLoader.loadClass(url, "com.bazlur.dc.Person");
			
			var constructor= personClass.getConstructor(String.class, int.class);
			
			var getName= personClass.getMethod("getName");
			var instance= constructor.newInstance("Sayeem", 14);
			var name= getName.invoke(instance);
			System.out.println(name);
		}catch (NoSuchMethodException  
			   | IllegalAccessException
			   |InvocationTargetException
			   |InstantiationException e) {
			
			e.printStackTrace();
			
		}

	}

}
