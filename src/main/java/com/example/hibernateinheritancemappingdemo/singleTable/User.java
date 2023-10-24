package com.example.hibernateinheritancemappingdemo.singleTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name= "st_users")   // This is not allowed while using @MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type", discriminatorType = DiscriminatorType.INTEGER)
//@MappedSuperclass
public class User {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Long id;
    private String name;
    private String email;
}
