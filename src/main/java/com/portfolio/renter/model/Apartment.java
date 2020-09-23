package com.portfolio.renter.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private Integer numberOfRooms;
    private Integer numberOfGuest;
    private Location location;
    private LocalDateTime datesToRent;
    private LocalDateTime freeDates;
    private User host;
    private String comments;
    private String photos

}
