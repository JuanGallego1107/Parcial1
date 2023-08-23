package org.example.repository.Impl;

import org.example.domain.enums.TypeContact;
import org.example.domain.models.Contact;
import org.example.mapper.dtos.contactDto;
import org.example.mapper.mappers.contactMapper;
import org.example.repository.ContactRepository;

import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {

    List<Contact> contacts;

    public ContactRepositoryImpl() {
        Contact con1 = new Contact("Juan Jose", "Barrio Ciudad Dorada", "325246356",
                "jjjj@gmail.com", TypeContact.amigos);
        Contact con2 = new Contact("Maria","Conjunto Verde","3534658",
                "mmmm@gmail.com", TypeContact.familia);
        Contact con3 = new Contact("Carlos","Conjunto Azul","35574673",
                "cccccca@gmail.com",TypeContact.trabajo);
        Contact con4 = new Contact("Martin","Barrio La maria","3489673",
                "mmmmar@gmail.com",TypeContact.amigos);
        Contact con5 = new Contact("Santiago","Conjunto Naranja","32344087",
                "santi@gmail.com",TypeContact.familia);
        Contact con6 = new Contact("Camilo","Conjunto Amarillo","36445808",
                "camilo@gmail.com",TypeContact.trabajo);

        contacts = List.of(con1, con2, con3, con4, con5,con6);
    }

    @Override
    public List<contactDto> getAllContacts() {
        return contactMapper.mapFrom(contacts);
    }
}
