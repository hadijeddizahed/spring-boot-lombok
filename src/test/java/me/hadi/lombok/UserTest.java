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
                .name("Ali")
                .email("Ali@gmail.com")
                .build();
        Assertions.assertNotNull(user,"Build user object successfully!");
    }
}
