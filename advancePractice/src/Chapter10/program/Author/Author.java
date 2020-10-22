package Chapter10.program.Author;

public class Author {
	
	private String firstname;
	private String lastName;
	
	public Author(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public String getFirstname() {
		return firstname;
	}

	public Author setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Author setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String toString() {
		return "Author [firstname=" + firstname + ", lastName=" + lastName + "]";
	}	
}
