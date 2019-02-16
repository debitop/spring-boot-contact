package com.example.springbootcontact.repository;

import com.example.springbootcontact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM contact EXCEPT (SELECT * FROM contact WHERE name~ ?1)")
    List<Contact> findContact(@Param("regExp") String regExp);
}
