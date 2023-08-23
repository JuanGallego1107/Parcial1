package org.example.domain.models;

import org.example.domain.enums.TypeContact;

public class Contact {
    private String name;
    private String adress;
    private String phoneNumber;
    private String email;
    private TypeContact typeContact;

    public Contact(String name, String adress, String phoneNumber, String email, TypeContact typeContact) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeContact = typeContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeContact getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(TypeContact typeContact) {
        this.typeContact = typeContact;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeContact=" + typeContact +
                '}';
    }
}
