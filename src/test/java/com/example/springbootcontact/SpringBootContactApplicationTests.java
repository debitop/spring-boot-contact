package com.example.springbootcontact;

import com.example.springbootcontact.model.Contact;
import com.example.springbootcontact.service.ContactService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootContactApplicationTests {
    private final static Logger LOGGER = Logger.getLogger(SpringBootContactApplicationTests.class.getName());
    private static final String TEST_NAME = "testName";
    private static final String TEST_UPDATE_NAME = "testUpdateName";


    @Autowired
    private ContactService contactService;

    @Test
    public void testCorrectPersistContact() {
        Contact persistedContact = contactService.save(mockContact());
        LOGGER.log(Level.INFO, "Message");
        System.out.println(persistedContact);
        Assert.assertNotNull("errorPersistedContact", persistedContact);
        Assert.assertEquals("errorSaveName", persistedContact.getName(), TEST_NAME);
        Assert.assertEquals("errorSaveId", persistedContact.getId(), 1);
    }

    @Test
    public void testCorrectUpdateContact() {
        Contact persistedContact = contactService.save(mockContact());
        System.out.println(persistedContact);
        persistedContact.setName(TEST_UPDATE_NAME);
        contactService.update(persistedContact.getId(), persistedContact);
        System.out.println(persistedContact);
     //   Contact
        Assert.assertEquals("errorUpdatedName", persistedContact.getName(), TEST_UPDATE_NAME);
        Assert.assertEquals("errorSaveId", persistedContact.getId(), 1);
    }

    ;

    @Test
    public void contextLoads() {
    }

    private Contact mockContact() {
        // TODO: 23.02.2019 use Builder
        Contact contact = new Contact();
        contact.setName(TEST_NAME);
        return contact;
    }

}

