package co.edu.uptc.TestJson.Controllers;

import co.edu.uptc.TestJson.dtos.Person;
import co.edu.uptc.TestJson.services.PersonService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/data")
public class TestController {

   @Autowired
    private PersonService service;


    @GetMapping("/list")
    public Person getNew() {
        return service.newPerson();
    }

    @GetMapping("/all")
    public List<Person> getNew2() {
        return service.newPeople();
    }


}

