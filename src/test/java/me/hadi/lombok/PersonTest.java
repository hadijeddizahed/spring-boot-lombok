package me.hadi.lombok;


import me.hadi.lombok.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonTest {


    private Person person;

    @BeforeEach
    public void init(){
        person = new Person(2l,"Amir",20000l);
    }

    @Test
    @DisplayName("Test setter and getter methods!")
    public void createPerson(){
        Person person = new Person();
        person.setName("Ali");
        person.setId(1l);
        person.setNationalCode(10000l);

        assertEquals(person.getName(),"Ali");
    }

    @Test
    public void testEquals(){

    }
}
