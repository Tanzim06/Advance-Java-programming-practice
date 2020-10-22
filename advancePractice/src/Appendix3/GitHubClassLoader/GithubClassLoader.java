package Appendix3.GitHubClassLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

public class GithubClassLoader extends ClassLoader {


	public GithubClassLoader(ClassLoader parent) {
		super(parent);
	}
	
	public Class loadClass(String url, String className) {
		
		try {
			var myUrl= new URL(url);
			
			var connection= myUrl.openConnection();
			var input= connection.getInputStream();
			var buffer= new ByteArrayOutputStream();
			int data= input.read();
			
			while(data != -1) {
				buffer.write(data);
				data= input.read();
			}
			
			input.close();
			var classData= buffer.toByteArray();
			
			return defineClass(className, classData, 0, classData.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
