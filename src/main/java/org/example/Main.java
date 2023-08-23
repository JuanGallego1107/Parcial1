package org.example;

import org.example.domain.enums.TypeContact;
import org.example.domain.models.Contact;
import org.example.service.impl.contactServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        contactServiceImpl contactService = new contactServiceImpl();

        String opc = "1";
        Scanner x = new Scanner(System.in);

        System.out.println("Digita el numero para hacer una consulta:" +
                "\n Consultas -> " +
                " \n 1. Añadir contacto" +
                " \n 2. Listas todos los contactos" +
                " \n 3. Filtrar contactos por categoria " +
                " \n 4. Contar cantidad de contactos por categoria." +
                " \n 5. Lista de contacto con nombre y telefono por categoria "+
                " \n 6. Salir");

        opc = x.next();
        switch (opc){

            case "1" :{
                break;
            }
            case "2" :{
                System.out.println(contactService.listAllContacts());
                break;
            }
            case "3" :{
                System.out.println(contactService.listFilterContacts());
                break;
            }
            case "4" :{
                System.out.println("Hay"+contactService.countTypeContacts()+"contactos de esta categoria.");
                break;
            }
            case "5" :{
                System.out.println(contactService.getNameNumberByType());
                break;
            }
            case "6" :
                break;

            default: {
                System.out.println("Ingrese un numero valido");
                break;
            }
        }
    }
    }