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
@Table(name="sports")
@AllArgsConstructor
@NoArgsConstructor
public class SportEntity {

    @Id
    @Column(name="")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="originCountry")
    private String originCountry;

    @Column(name="captainName")
    private String captainName;

    @Column(name="totalPlayers")
    private int totalPlayers;



}
