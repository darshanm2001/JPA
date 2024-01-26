package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="metal")
@AllArgsConstructor
public class MetalEntity {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="color")
    private String color;


    @Column(name="cost")
    private double cost;

    @Column(name="weight")
    private String weight;

}
