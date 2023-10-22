package com.example.hibernateinheritancemappingdemo.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "4")
public class TA extends User{
    private Time startTime;
    private Time endTime;
}
