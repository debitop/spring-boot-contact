package com.example.springbootcontact.service;


import com.example.springbootcontact.model.Contact;

import java.util.List;

public interface ContactService {
    public Contact save(Contact contact);

    public void update(int id, Contact contact);

    public void delete(int id);

    public List<Contact> findContact(String regExp);

    public Contact getOne(int id);

    public void deleteAll();
}
