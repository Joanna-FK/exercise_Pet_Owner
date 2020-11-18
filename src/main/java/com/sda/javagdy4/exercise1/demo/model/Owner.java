package com.sda.javagdy4.exercise1.demo.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageAgeOfPets;
    private Integer numberOfPets;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Pet> petSet;




}
