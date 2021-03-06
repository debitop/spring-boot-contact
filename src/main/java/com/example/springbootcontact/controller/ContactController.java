package com.example.springbootcontact.controller;

import com.example.springbootcontact.model.Contact;
import com.example.springbootcontact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/save")
    public void save(@RequestBody Contact contact) {
        contactService.save(contact);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/{regExp}")
    public List<Contact> findContact(@PathVariable("regExp") String regExp) {
        return contactService.findContact(regExp);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        contactService.delete(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/{id}")
    public void update(@PathVariable("id") int id, @RequestBody Contact contact) {
        contactService.update(id, contact);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/getone/{id}")
    public Contact getOne(@PathVariable Integer id) {
        Contact contact = contactService.getOne(id);
        System.out.println(contact);
        return contact;
    }

}
