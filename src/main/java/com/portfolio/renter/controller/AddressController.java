package com.portfolio.renter.controller;

import com.portfolio.renter.api.AddressApi;
import com.portfolio.renter.api.model.AddressDTO;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController extends AbstractController implements AddressApi {
  @Override
  public ResponseEntity<AddressDTO> addAddress(@Valid AddressDTO addressDTO) {
    return null;
  }

  @Override
  public ResponseEntity<AddressDTO> deleteAddress(@Min(0) Integer id) {
    return null;
  }

  @Override
  public ResponseEntity<AddressDTO> editAddress(@Valid AddressDTO addressDTO) {
    return null;
  }

  @Override
  public ResponseEntity<AddressDTO> getAddress(@Min(0) Integer id) {
    return null;
  }
}
