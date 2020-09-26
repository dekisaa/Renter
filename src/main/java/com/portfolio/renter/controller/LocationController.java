package com.portfolio.renter.controller;

import com.portfolio.renter.api.LocationApi;
import com.portfolio.renter.api.model.LocationDTO;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController extends AbstractController implements LocationApi {

  @Override
  public ResponseEntity<LocationDTO> addLocation(@Valid LocationDTO locationDTO) {
    return null;
  }

  @Override
  public ResponseEntity<LocationDTO> getLocation(@Min(0) Integer id) {
    return new ResponseEntity<>(new LocationDTO().latitude("12341"), HttpStatus.OK);
  }
}
