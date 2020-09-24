package com.portfolio.renter.model;

import com.portfolio.renter.model.enums.RoomType;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.*;

@Entity
public class Apartment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private RoomType roomType;

  private Integer numberOfRooms;
  private Integer numberOfGuest;
  private LocalDateTime datesToRent;
  private LocalDateTime freeDates;
  private Double price;
  private LocalTime checkIn;
  private LocalTime checkOut;

  // is apartment active for renting or not
  private Boolean status;

  @ManyToOne(fetch = FetchType.LAZY)
  private Location  location;

  @ManyToOne(fetch = FetchType.LAZY)
  private User host;

  @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Reservation> reservations;

  @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<CommentForApartment> comments;

  @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Image> images;

  @ManyToMany(
          fetch = FetchType.LAZY,
          cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
          name = "amenities",
          joinColumns = {@JoinColumn(name = "apartment_id")},
          inverseJoinColumns = {@JoinColumn(name = "amenity_id")})
  private List<Amenity> amenities;

  @ManyToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "guestList",
      joinColumns = {@JoinColumn(name = "apartment_id")},
      inverseJoinColumns = {@JoinColumn(name = "user_id")})
  private List<User> guests;



}
