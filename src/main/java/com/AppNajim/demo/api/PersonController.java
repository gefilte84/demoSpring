package com.AppNajim.demo.api;

import com.AppNajim.demo.model.Person;
import com.AppNajim.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// dependencies injecton
// Rest kontroller
@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    // referanse til service
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // metode for å legge til person. Lages som POST for å kunne legge til
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
}
