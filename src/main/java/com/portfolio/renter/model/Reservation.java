package com.portfolio.renter.model;

import com.portfolio.renter.model.enums.ReservationStatus;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime startingDate;
  private Integer numberOfDays;
  private Double finalePrice;
  private ReservationStatus reservationStatus;

  @ManyToOne(fetch = FetchType.LAZY)
  private Apartment apartment;

  @ManyToOne(fetch = FetchType.LAZY)
  private User guest;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getStartingDate() {
    return startingDate;
  }

  public void setStartingDate(LocalDateTime startingDate) {
    this.startingDate = startingDate;
  }

  public Integer getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(Integer numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public Double getFinalePrice() {
    return finalePrice;
  }

  public void setFinalePrice(Double finalePrice) {
    this.finalePrice = finalePrice;
  }

  public ReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(ReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public Apartment getApartment() {
    return apartment;
  }

  public void setApartment(Apartment apartment) {
    this.apartment = apartment;
  }

  public User getGuest() {
    return guest;
  }

  public void setGuest(User guest) {
    this.guest = guest;
  }
}
