package Chapter03.program.PersonProcessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonProcessor {
	
	public static void forEach(List<Person> persons, Consumer<Person> func) {
		for(Person person :persons) {
			func.accept(person);
		}
	}

	public static void main(String[] args) {
		List<Person> persons= Arrays.asList(
				new Person("Jahanara Imam", 65, "jahanara@imam.com"),
				new Person("Zahir Raihan", 36, "jahir@raihan.com")
				);
		//forEach(persons,  person->person.sendEmail());
		forEach(persons, Person::sendEmail);

	}

}
