package com.AIT.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIT.bindings.ContactForm;
import com.AIT.entities.contact;
import com.AIT.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;
	@Override
	public String saveContact(ContactForm form) {
		// TODO Auto-generated method stub
		contact entity = new contact();
		entity.setActiveSw("Y");
		BeanUtils.copyProperties(form, entity);
		contactRepo.save(entity);
		if(entity.getContactId()!=null) {
			return "contact saved";
		}
		return "contact not saved";
	}

	@Override
	public List<ContactForm> viewContacts() {
		List<ContactForm> dataList= new ArrayList<>();
		
		List<contact> findAll =contactRepo.findAll();
		for(contact entity : findAll) {
			ContactForm form = new ContactForm();
			BeanUtils.copyProperties(entity, form);
			dataList.add(form);
			
		}
		return null;
	}

	@Override
	public ContactForm editContact(Integer contactId) {
		// TODO Auto-generated method stub
		
		Optional<contact> findById = contactRepo.findById(contactId);
		if(findById.isPresent()) {
			contact entity = findById.get();
			ContactForm form = new ContactForm();
			BeanUtils.copyProperties(entity, form);
			return form;
		}
		
		return null;
	}

	@Override
	public List<ContactForm> DeleteContact(Integer contactId) {
		// TODO Auto-generated method stub
		
		contactRepo.deleteById(contactId);
		
List<ContactForm> dataList= new ArrayList<>();
		
		List<contact> findAll =contactRepo.findAll();
		for(contact entity : findAll) {
			ContactForm form = new ContactForm();
			BeanUtils.copyProperties(entity, form);
			dataList.add(form);
			
		}
		return dataList;
	}

}
