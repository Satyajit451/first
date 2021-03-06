package com.AIT.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AIT.bindings.ContactForm;
import com.AIT.service.ContactService;

@RestController 
public class ContactRestController {
	@Autowired
	private ContactService service;
	@PostMapping("/save")
	public String saveContact(@RequestBody ContactForm form) {
		System.out.println("form");
		String status = service.saveContact(form);
		return status;
		
	}
	@GetMapping("/contacts")
	public List<ContactForm> viewAllContacts(){
		System.out.println("viewAllContact() method called");
		return service.viewContacts();
	}
	@GetMapping("/edit/{contactId}")
	public ContactForm editContact(@PathVariable Integer contactId) {
		return service.editContact(contactId);
		
	}
	@DeleteMapping("/delete/{contactId}")
	public List<ContactForm> deletContact(@PathVariable Integer contactId){
		return service.DeleteContact(contactId);
	}

}
