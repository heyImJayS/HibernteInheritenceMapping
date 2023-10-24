package com.example.hibernateinheritancemappingdemo.tablePerClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name= "tpc_users")   // This is not allowed while using @MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class User {
    // GenerationType.AUTO and   GenerationType.SEQUENCE <- This will create extra tables named as <name>_seq
    //GenerationType.IDENTITY won't work in TABLE_PER_CLASS
    //Reason: https://stackoverflow.com/questions/916169/cannot-use-identity-column-key-generation-with-union-subclass-table-per-clas
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Long id;
    private String name;
    private String email;
}
