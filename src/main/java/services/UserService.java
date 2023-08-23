package services;

import entities.User;
import services.exceptions.ResourceNotFoundException;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id) throws ResourceNotFoundException;
    User insert(User user);
    void delete(Long id) throws ResourceNotFoundException;
    User update(Long id, User updatedUser) throws ResourceNotFoundException;
}