package com.technogadgets.ph.Services;

import java.util.List;
import com.technogadgets.ph.model.ContactModel;



public interface ContactService {


		//method in adding a contact
		void addContact(ContactModel contactModel);
		
		//get all list of products
		List<ContactModel> getAllContacts();
		
		//update a product
		ContactModel getContactById(long id);
		
		//delete employee
		public void deleteContactById(long id);
	
	
}
