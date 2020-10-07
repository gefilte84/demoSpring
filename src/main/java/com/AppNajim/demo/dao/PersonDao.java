package com.AppNajim.demo.dao;


import com.AppNajim.demo.model.Person;

import java.util.UUID;

// interface for definisjon av operasjoner som er tillat for de som ønsker å implementere interface
// denne klassen vil legge inn person med random UUID inn i database
public interface PersonDao {

    // denne legger inn person med ID
    int insertPerson(UUID id, Person person);

    // samme som over men det generer id med engang.
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
