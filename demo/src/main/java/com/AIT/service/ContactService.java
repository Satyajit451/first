package com.AIT.service;

import java.util.List;

import com.AIT.bindings.ContactForm;

public interface ContactService {
	public String saveContact(ContactForm form);
	public List<ContactForm> viewContacts();
	public ContactForm editContact(Integer contactId);
	public List<ContactForm> DeleteContact(Integer contactId);
	
	

}
