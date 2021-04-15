package com.cobratms.controller;

import com.cobratms.domain.User;
import com.cobratms.repository.UserRepository;
import com.cobratms.service.UserService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.concurrent.ExecutionException;


@WebMvcTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    UserController userController;

    @MockBean
    UserService userService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void whenPostRequestToUsersAndValidUser_thenCorrectResponse() throws Exception {
        String user = "{\"name\":\"ABC\", \"login\":\"lolman\", \"password\":\"pswrd\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .content(user)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void whenPostRequestToUsersAndInValidUser_thenCorrectResponse() throws Exception {
        String user = "{\"name\": \"\", \"email\" : \"bob@domain.com\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .content(user)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
