package Chapter01.program.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	public List<Contact> findContacts(List<Contact> contacts, FilterCriteria criteria){
		List<Contact> matchedContacts= new ArrayList<>();
		
		for(Contact contact: contacts) {
			if(criteria.match(contact)) {
				matchedContacts.add(contact);
			}
		}
		
		return matchedContacts;
	}
}
