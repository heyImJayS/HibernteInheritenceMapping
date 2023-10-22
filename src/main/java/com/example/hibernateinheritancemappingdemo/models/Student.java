package com.example.hibernateinheritancemappingdemo.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "3")
public class Student extends User{
    private int psp;
    private String batchName;
}
