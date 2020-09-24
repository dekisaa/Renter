package com.portfolio.renter.security;

import com.portfolio.renter.model.Role;
import com.portfolio.renter.model.User;
import com.portfolio.renter.service.UserService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AuthorizationCustom {

  @Autowired private UserService userService;

  public Boolean hasAccess(String role) {
    User user = userService.getCurrentUser();
    Set<Role> set = user.getRoles();

    for (Role r : set) {
      if (r.getName().equals(role)) return true;
    }

    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "You don't have a permission!");
  }
}
