package me.hadi.lombok.nonnull;


import me.hadi.lombok.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
public class PersonNonNullTest {

    private Person person;


    @BeforeEach
    public void init(){
        person = new Person(1l,"Ali",1000l);
    }


    @Test
    public void createNonNullPerson(){
        PersonNonNull personNonNull = new PersonNonNull();
        personNonNull.map(person);
        AssertionErrors.assertEquals("Both of their name is EQUAL!",personNonNull.getName(),person.getName());
    }


    @Test
    public void throwException(){
        PersonNonNull personNonNull = new PersonNonNull();
        Assertions.assertThrows(NullPointerException.class,()->personNonNull.map(null));
    }

}
