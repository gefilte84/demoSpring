package com.AppNajim.demo.service;

import com.AppNajim.demo.dao.PersonDao;
import com.AppNajim.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Dette er service
@Service
public class PersonService {

    private final PersonDao personDao;

    // Autowirer inn i PersonDato interfacet
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    // metode for å legge inn ny person
    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
