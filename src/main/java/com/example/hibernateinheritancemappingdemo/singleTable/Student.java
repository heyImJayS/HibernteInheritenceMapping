package com.example.hibernateinheritancemappingdemo.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="st_student")
@DiscriminatorValue(value = "3")
public class Student extends User{
    private int psp;
    private String batchName;
}
