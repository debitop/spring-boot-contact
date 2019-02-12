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
    public void save() {

    }

    @Override
    public List<Contact> findContact() {
        return null;
    }
}
