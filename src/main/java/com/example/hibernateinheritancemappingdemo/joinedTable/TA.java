package com.example.hibernateinheritancemappingdemo.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity(name="jt_ta")
@PrimaryKeyJoinColumn(name = "user_id")     //Renaming the foreign Key
public class TA extends User {
    private Time startTime;
    private Time endTime;
}
