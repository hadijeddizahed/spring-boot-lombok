package me.hadi.lombok;


import me.hadi.lombok.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonTest {


    @Test
    @DisplayName("Test setter and getter methods!")
    public void createPerson(){
        Person person = new Person();
        person.setName("Ali");
        person.setId(1l);
        person.setNationalCode(10000l);

        assertEquals(person.getName(),"Ali");
    }
}
