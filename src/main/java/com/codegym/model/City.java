package com.codegym.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Region region;
    private double area;
    private int population;
    private double gdp;
    private String description;
}
