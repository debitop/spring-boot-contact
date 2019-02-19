package com.example.springbootcontact.repository;

import com.example.springbootcontact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM contact EXCEPT (SELECT * FROM contact WHERE name~ ?1)")
    List<Contact> findContact(@Param("regExp") String regExp);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE contact SET name=?2 WHERE id=?1")
    void update(@Param("id") int id, @Param("name") String name);


}
