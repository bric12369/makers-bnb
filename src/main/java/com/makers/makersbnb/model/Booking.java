package com.makers.makersbnb.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BOOKINGS")
@Getter @Setter @NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String start_date;
    private String end_date;
    private Long space_id;

    public void Booking(Long id, String start_date, String end_date, Long space_id){
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.space_id = space_id;
    }
}
