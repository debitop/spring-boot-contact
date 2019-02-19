package com.example.springbootcontact.service;

import com.example.springbootcontact.model.Contact;
import com.example.springbootcontact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void update(int id, Contact contact) {
        contactRepository.update(id, contact.getName());
    }

    @Override
    public void delete(int id) {
        contactRepository.delete(id);
    }

    @Override
    public List<Contact> findContact(String regExp) {
        return contactRepository.findContact(regExp);
    }
}
