package com.technogadgets.ph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.technogadgets.ph.Services.ContactService;
import com.technogadgets.ph.model.ContactModel;




@Controller
public class ContactController {
	
	@Autowired
	public ContactService contactService;
	
	@PostMapping(value = "/addContact")
    public String addContact(@ModelAttribute("contacts")ContactModel model, BindingResult result) {
        // save employee to database
		if(result.hasFieldErrors()) {
			return "contact";
		}
		//this will lead to add values
		contactService.addContact(model);
        return "index";
    }
	
	
} 
