package Chapter01.program.Contact;

import java.util.List;

public class ContactApp {

	public static void main(String[] args) {
		List<Contact> contactList=List.of(new Contact("Will Smith", "will@gmail.com", 50, Contact.Gender.MALE),
										  new Contact("Ellen Degeneres", "elen@gmail.com", 60, Contact.Gender.FEMALE),
										  new Contact("Nuhash Humayun", "nuhash@gmail.com", 23, Contact.Gender.MALE)
										  );
		
		ContactService contactService= new ContactService();
		List<Contact> contactAged18To25= contactService.findContacts(contactList, (Contact contact)->{
			return 18<= contact.getAge() && contact.getAge()<=25
					&& contact.getGender()==Contact.Gender.FEMALE;
		});
	}

}
/*
  new FilterCriteria() {
			
			@Override
			public boolean match(Contact contact) {
				
				return 18<= contact.getAge() && contact.getAge()<=25
						&& contact.getGender()==Contact.Gender.FEMALE;
			}
  */