package com.example.hibernateinheritancemappingdemo.tablePerClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity(name="tpc_ta")
public class TA extends User {
    private Time startTime;
    private Time endTime;
}
