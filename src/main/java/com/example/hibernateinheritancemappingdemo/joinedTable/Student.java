package com.example.hibernateinheritancemappingdemo.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_student")
@PrimaryKeyJoinColumn(name = "user_id")     //Renaming the foreign Key
public class Student extends User {
    private int psp;
    private String batchName;
}
