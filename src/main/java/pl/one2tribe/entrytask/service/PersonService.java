package pl.one2tribe.entrytask.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.one2tribe.entrytask.model.Person;
import pl.one2tribe.entrytask.model.PersonDTO;
import pl.one2tribe.entrytask.model.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor

@Service
public class PersonService {
    private PersonRepository repository;

    public List<PersonDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(PersonDTO::new)
                .collect(Collectors.toList());
    }

    public Person add(Person person){
        repository.save(person);
        return person;
    }
}
