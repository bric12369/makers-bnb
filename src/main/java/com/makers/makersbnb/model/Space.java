package com.makers.makersbnb.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SPACES")
@Getter @Setter @NoArgsConstructor
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Integer price;

    public Space(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

}

