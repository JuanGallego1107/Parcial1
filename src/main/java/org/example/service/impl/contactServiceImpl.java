package org.example.service.impl;

import org.example.domain.enums.TypeContact;
import org.example.domain.models.Contact;
import org.example.mapper.dtos.contactDto;
import org.example.repository.ContactRepository;
import org.example.repository.Impl.ContactRepositoryImpl;
import org.example.service.contactService;

import java.util.List;

public class contactServiceImpl implements contactService {

    List<contactDto> contacts;

    public contactServiceImpl() {
        ContactRepository repo = new ContactRepositoryImpl();
        contacts = repo.getAllContacts();
    }

    @Override
    public String addContact(Contact contact) {
        /*contacts.addAll(new contactDto("Juan Jose", "Barrio Ciudad Dorada", "325246356",
                "jjjj@gmail.com", TypeContact.amigos));
        return "Añadido";*/
        return null;
    }

    @Override
    public List<contactDto> listAllContacts() {
        return contacts.stream().toList();
    }

    @Override
    public List<contactDto> listFilterContacts() {
        return contacts.stream()
                .filter(e->e.typeContact() == TypeContact.trabajo)
                .toList();
    }

    @Override
    public Long countTypeContacts() {
        return contacts.stream()
                .filter(e->e.typeContact() == TypeContact.amigos)
                .count();
    }

    @Override
    public List<String> getNameNumberByType() {
        return contacts.stream()
                .filter(e->e.typeContact() == TypeContact.familia)
                .map(contactDto::name)
                .toList();
    }
}
