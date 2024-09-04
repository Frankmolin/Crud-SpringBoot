package com.crud.Simple_Crud.Services;

import com.crud.Simple_Crud.Models.UserModel;
import com.crud.Simple_Crud.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Obtener todos los usuarios
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Crear o actualizar un usuario
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    // Eliminar un usuario
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
