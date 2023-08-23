package org.example.mapper.dtos;

import org.example.domain.enums.TypeContact;

public record contactDto(String name,
                         String address,
                         String phoneNumber,
                         String email,
                         TypeContact typeContact) {

}
