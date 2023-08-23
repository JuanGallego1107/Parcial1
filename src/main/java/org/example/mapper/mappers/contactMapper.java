package org.example.mapper.mappers;

import org.example.domain.models.Contact;
import org.example.mapper.dtos.contactDto;

import java.util.List;

public class contactMapper {
    public static contactDto mapFrom(Contact source) {
        return new contactDto(source.getName(),
                source.getAdress(),
                source.getPhoneNumber(),
                source.getEmail(),
                source.getTypeContact());
    }

    public static Contact mapFrom(contactDto source) {
        return new Contact(source.name(),
                source.address(),
                source.phoneNumber(),
                source.email(),
                source.typeContact());
    }

    public static List<contactDto> mapFrom(List<Contact> source) {
        return source.parallelStream().map(e -> mapFrom(e)).toList();
    }

    public static List<Contact> mapFromDto(List<contactDto> source) {
        return source.parallelStream().map(e -> mapFrom(e)).toList();
    }

}
