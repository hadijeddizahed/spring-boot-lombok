package me.hadi.lombok.nonnull;


import lombok.Data;
import lombok.NonNull;
import me.hadi.lombok.model.Person;

@Data
public class PersonNonNull {

    private Long id;
    private String name;
    private Long nationalCode;


    public PersonNonNull map(@NonNull Person person) {
        this.name = person.getName();
        this.id = person.getId();
        this.nationalCode = person.getNationalCode();
        return this;
    }
}
