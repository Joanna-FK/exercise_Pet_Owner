package com.sda.javagdy4.exercise1.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity()
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String ownerName;
    private double weight;
    private boolean pureRace;
    private Race race;
    @ManyToOne()
    @EqualsAndHashCode.Exclude
    private Owner owner;
}
