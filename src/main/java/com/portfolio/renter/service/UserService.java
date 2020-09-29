package com.portfolio.renter.service;

import com.portfolio.renter.api.model.UserDTO;
import com.portfolio.renter.model.Role;
import com.portfolio.renter.model.User;
import com.portfolio.renter.repository.RoleRepository;
import com.portfolio.renter.repository.UserRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  @Autowired private RoleRepository roleRepository;

  private final PasswordEncoder passwordEncoder;

  public UserService(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  public User getCurrentUser() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Optional<User> user = userRepository.findByUsername(auth.getName());
    return user.get();
  }

  public User signUp(UserDTO userDTO) {
    if (userRepository.existsByUsername(userDTO.getUsername())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username is already taken!");
    }

    if (userRepository.existsByEmail(userDTO.getEmail())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email is registered!");
    }
    System.out.println(userDTO.getRole().trim());
    Role role =
        roleRepository
            .findByName(userDTO.getRole().trim())
            .orElseThrow(() -> new RuntimeException("Role can't be found!"));

    Set<Role> tempRoles = new HashSet<>();

    String password = passwordEncoder.encode(userDTO.getPassword());

    User user = new User();

    user.setName(userDTO.getName());
    user.setLastname(userDTO.getLastname());
    user.setEmail(userDTO.getEmail());
    user.setUsername(userDTO.getUsername());
    tempRoles.add(role);
    user.setRoles(tempRoles);
    user.setPassword(password);

    user = userRepository.save(user);

    userDTO.setPassword("");

    return user;
  }
}
