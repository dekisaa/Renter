package com.portfolio.renter.controller;

import com.portfolio.renter.api.AmenityApi;
import com.portfolio.renter.api.model.AddressDTO;
import com.portfolio.renter.api.model.AmenityDTO;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController extends AbstractController implements AmenityApi {
  @Override
  public ResponseEntity<AddressDTO> addAmenity(@Valid AddressDTO addressDTO) {
    return null;
  }

  @Override
  public ResponseEntity<AmenityDTO> editAmenity(@Min(0) Integer id, @Valid AmenityDTO amenityDTO) {
    return null;
  }
}
