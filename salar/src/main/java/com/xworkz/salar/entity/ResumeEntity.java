package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="resume")
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name="r_id")
    private int r_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="second_name")
    private String second_name;

    @Column(name="degree")
    private String degree;

    @Column(name="experience")
    private int experience;


}
