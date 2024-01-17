package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="toy")
@AllArgsConstructor
@NoArgsConstructor
public class ToyEntity {
    @Id
    @Column(name="t_id")
    private int t_id;

    @Column(name="name")
    private String name;

    @Column(name="color")
    private String color;

    @Column(name="cost")
    private int cost;

    @Column(name="material")
    private String material;
}
