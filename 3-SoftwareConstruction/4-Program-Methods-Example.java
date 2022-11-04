package com.nuop.tscp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserForm userForm) {

        User user = new User();

        user.setRole(userForm.getRole());
        user.setName(userForm.getName());
        user.setSurname(userForm.getSurname());
        user.setGender(userForm.getGender());
        user.setProfession(userForm.getProfession());
        user.setEmail(userForm.getEmail());
        user.setEmail(userForm.getMobile());
        user.setHeights(userForm.getHeights());
        user.setWeights(userForm.getWeights());

        return user;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

