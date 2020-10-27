package com.portfolio.renter.controller;

import com.portfolio.renter.controller.dto.UserDTO;
import com.portfolio.renter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired private UserService userService;

  @RequestMapping(
      value = "/registration",
      method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> userRegistration(@RequestBody UserDTO user) {
    System.out.println(user);
    userService.signUp(user);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
