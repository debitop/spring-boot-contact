package com.example.springbootcontact.service;


import com.example.springbootcontact.model.Contact;

import java.util.List;

public interface ContactService {
    public void save();

    public List<Contact> findContact();
}
