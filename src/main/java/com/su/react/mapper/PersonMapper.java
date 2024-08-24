package com.su.react.mapper;

import com.su.react.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    Person getPerson(int id);

    void updatePerson(Person person);

}
