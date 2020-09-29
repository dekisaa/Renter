package com.portfolio.renter.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Amenity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE},
      mappedBy = "amenities")
  private List<Apartment> apartment;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNaziv() {
    return name;
  }

  public void setNaziv(String naziv) {
    this.name = naziv;
  }
}
