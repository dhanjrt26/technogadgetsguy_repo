package com.technogadgets.ph.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technogadgets.ph.Repository.ContactRepository;
import com.technogadgets.ph.model.ContactModel;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	
	@Override
	public void addContact(ContactModel contactModel) {
		// TODO Auto-generated method stub
		//this method is used to add products
		this.contactRepository.save(contactModel);
	}

	@Override
	public List<ContactModel> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public ContactModel getContactById(long id) {
		// TODO Auto-generated method stub
		Optional <ContactModel > optional = contactRepository.findById(id);
		ContactModel contactModel = null;
        if (optional.isPresent()) {
            contactModel = optional.get();
        } else {
            throw new RuntimeException(" Contact not found for id :: " + id);
        }
        return contactModel;
	}

	@Override
	public void deleteContactById(long id) {
		// TODO Auto-generated method stub
		this.contactRepository.deleteById(id);
	}

}
