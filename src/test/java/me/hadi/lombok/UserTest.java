package me.hadi.lombok;


import me.hadi.lombok.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    
    private User user;

    @Test
    public void createUser() {
        user = User.builder()
                .age(30)
                .firstName("Ali")
                .gender("M")
                .id(1000l)
                .lastName("Daie")
                .build();
        Assertions.assertNotNull(user,"Build user object successfully!");
    }
}
