package co.edu.uptc.TestJson.services;

import co.edu.uptc.TestJson.dtos.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public Person newPerson(){
        Person person = new Person(1,"Jose","Aponte");
        return person;
    }


    public List<Person> newPeople(){
        List list = new ArrayList<>();
        list.add(new Person(2,"Maria","Torres"));
        list.add(new Person(2,"Maria","Torres"));
        list.add(new Person(2,"Maria","Torres"));

        return list;
    }


}
