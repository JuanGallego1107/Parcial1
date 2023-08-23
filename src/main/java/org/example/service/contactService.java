package org.example.service;

import org.example.domain.enums.TypeContact;
import org.example.domain.models.Contact;
import org.example.mapper.dtos.contactDto;

import java.util.List;
import java.util.Optional;

public interface contactService {
    String addContact(Contact contact);
    List<contactDto> listAllContacts();
    List<contactDto> listFilterContacts();
    Long countTypeContacts();
    List<String> getNameNumberByType();

}
