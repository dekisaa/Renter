package com.portfolio.renter.service;

import com.portfolio.renter.model.User;
import com.portfolio.renter.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  public User getCurrentUser() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Optional<User> user = userRepository.findByUsername(auth.getName());
    return user.get();
  }
}
