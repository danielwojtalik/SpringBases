package pl.one2tribe.entrytask.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PersonDTO {

    private Long id;
    private String name;

    public PersonDTO(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person from DB is null");
        }
        this.id = person.getId();
        this.name = person.getName();
    }
}
