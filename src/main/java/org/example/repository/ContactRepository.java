package org.example.repository;

import org.example.mapper.dtos.contactDto;

import java.util.List;

public interface ContactRepository {
    List<contactDto> getAllContacts();
}
