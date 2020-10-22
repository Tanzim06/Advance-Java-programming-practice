package Chapter12.program.ClassObjectDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import Chapter03.program.PersonProcessor.Person;

public class ClassObjectDemo {

	public static void main(String[] args) {
		Person person= new Person("James Gosling");
		
		Class<? extends Person> personClass= person.getClass();
		Class<?> superclass= personClass.getSuperclass();
		
		System.out.println("class Name: "+ personClass.getName());
		System.out.println("super class Name: "+ superclass.getName());
		
		System.out.println("Fields: ");
		Field[] fields= personClass.getDeclaredFields();
		
		for(Field field: fields) {
			String fieldName= field.getName();
			Class<?> fieldType= field.getType();
			
			System.out.println("Field Name: "+ fieldName +", fieldType: "+ fieldType );
		}
			
			System.out.println("Methods: ");
			
			Method[] methods= personClass.getDeclaredMethods();
			
			for(Method method: methods) {
				String methodName= method.getName();
				Class<?> returnType= method.getReturnType();
				Class<?>[] parameterTypes= method.getParameterTypes();
				
				System.out.println("method Name: "+ methodName
						          + ", return Type: "+ returnType
						          +", parameter types: "+ Arrays.toString(parameterTypes));
				
				
				
			}
		

	}

}
