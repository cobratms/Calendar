package com.cobratms.repository;


import com.cobratms.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryUnitTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveNewUserTest_Successful() throws Exception {
        User user = new User();
        user.setLogin("login");
        user.setName("test");
        user.setPassword("password");

        userRepository.save(user);

        User findUser = userRepository.findUserByName(user.getName());

        Assertions.assertEquals("test", findUser.getName());
    }
}
