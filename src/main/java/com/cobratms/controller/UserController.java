package com.cobratms.controller;

import com.cobratms.domain.User;
import com.cobratms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/set")
    private void setNewUser(@Valid @RequestBody User user) {
        userService.saveNewUser(user);
    }

    @GetMapping("/get/{userId}")
    private User getUserById(@PathVariable Long userId) {
        Optional<User> user = userService.getUserById(userId);
        return user.orElseGet(User::new);
    }

    @DeleteMapping("/delete/{userId}")
    private void deleteUserbyID(@PathVariable Long userId) {
        userService.deleteUserById(userId);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
