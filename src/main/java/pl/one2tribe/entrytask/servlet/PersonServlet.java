package pl.one2tribe.entrytask.servlet;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.one2tribe.entrytask.model.Person;
import pl.one2tribe.entrytask.model.PersonDTO;
import pl.one2tribe.entrytask.service.PersonService;

import javax.validation.Valid;
import java.util.List;

@Log
@AllArgsConstructor

@RestController
class PersonServlet {

    private PersonService service;

    @RequestMapping("/list")
    ResponseEntity<List<PersonDTO>> findAllPeople() {
        log.info("Get request for list of People");
        return ResponseEntity.ok(service.findAll());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    ResponseEntity<Person> add(@Valid @RequestBody Person person) {
        log.info("Post request for add Person to DB");
        return ResponseEntity.ok(service.add(person));
    }


}
