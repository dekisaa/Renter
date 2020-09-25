package com.portfolio.renter.model;

import javax.persistence.*;

@Entity
public class CommentForApartment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String comment;
  private Integer rating;

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

  public User getGuest() {
    return guest;
  }

  public void setGuest(User guest) {
    this.guest = guest;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Apartment getApartment() {
    return apartment;
  }

  public void setApartment(Apartment apartment) {
    this.apartment = apartment;
  }
}
