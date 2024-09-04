package com.crud.Simple_Crud.Controllers;


import com.crud.Simple_Crud.Models.UserModel;
import com.crud.Simple_Crud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Obtener todos los usuarios

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    // Obtener un usuario por ID

    @GetMapping("/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }


    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(
             @PathVariable Long id) {
        userService.deleteUser(id);
    }
}
