package com.makers.makersbnb.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "BOOKINGS")
@Getter @Setter @NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate start_date;
    private LocalDate end_date;
    @Column(name="space_id")
    private Long spaceId;

    public void Booking(Long id, LocalDate start_date, LocalDate end_date, Long space_id){
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.spaceId = space_id;
    }
}
