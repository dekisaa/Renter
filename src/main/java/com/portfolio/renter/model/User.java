package com.portfolio.renter.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String name;
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private List<UserRole> role;

    private List<Apartment> myApartments;
    private List<Apartment> rentedApartemnts;
    private List<Reservation> reservations;
}
