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

  @ElementCollection
  @CollectionTable(name = "dates_to_rent", joinColumns = @JoinColumn(name = "apartment_id"))
  private List<LocalDateTime> datesToRent;

  @ElementCollection
  @CollectionTable(name = "free_dates_to_rent", joinColumns = @JoinColumn(name = "apartment_id"))
  private List<LocalDateTime> freeDates;

  private Double price;
  private LocalTime checkIn;
  private LocalTime checkOut;

  // is apartment active for renting or not
  private Boolean status;

  @ManyToOne(fetch = FetchType.LAZY)
  private Location location;

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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomType getRoomType() {
    return roomType;
  }

  public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
  }

  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public Integer getNumberOfGuest() {
    return numberOfGuest;
  }

  public void setNumberOfGuest(Integer numberOfGuest) {
    this.numberOfGuest = numberOfGuest;
  }

  public List<LocalDateTime> getDatesToRent() {
    return datesToRent;
  }

  public void setDatesToRent(List<LocalDateTime> datesToRent) {
    this.datesToRent = datesToRent;
  }

  public List<LocalDateTime> getFreeDates() {
    return freeDates;
  }

  public void setFreeDates(List<LocalDateTime> freeDates) {
    this.freeDates = freeDates;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public LocalTime getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(LocalTime checkIn) {
    this.checkIn = checkIn;
  }

  public LocalTime getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(LocalTime checkOut) {
    this.checkOut = checkOut;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public User getHost() {
    return host;
  }

  public void setHost(User host) {
    this.host = host;
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }

  public List<CommentForApartment> getComments() {
    return comments;
  }

  public void setComments(List<CommentForApartment> comments) {
    this.comments = comments;
  }

  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public List<Amenity> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<Amenity> amenities) {
    this.amenities = amenities;
  }

  public List<User> getGuests() {
    return guests;
  }

  public void setGuests(List<User> guests) {
    this.guests = guests;
  }
}
