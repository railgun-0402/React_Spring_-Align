package com.su.react.service;

import com.su.react.mapper.PersonMapper;
import com.su.react.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person getPerson(int id) {
        return personMapper.getPerson(id);
    }

    public void updatePerson(Person person) {
        personMapper.updatePerson(person);
    }
}
