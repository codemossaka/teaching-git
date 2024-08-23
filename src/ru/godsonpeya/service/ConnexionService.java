package ru.godsonpeya.service;

import ru.godsonpeya.entity.Person;

public class ConnexionService {

    public void connect(Person person){
        System.out.println(person.getName()+" est connecte");
    }
}
