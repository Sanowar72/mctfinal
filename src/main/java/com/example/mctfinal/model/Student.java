package com.example.mctfinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentid;
    private String studentname;
}
