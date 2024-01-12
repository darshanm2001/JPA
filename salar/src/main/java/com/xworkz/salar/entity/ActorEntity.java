package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="actor")
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name="a_id")
    private int a_id;

    @Column(name="a_name")
    private String a_name;

    @Column(name="no_of_films")
    private int no_of_films;

    @Column(name="first_film")
    private String first_film;

    @Column(name="salary")
    private int salary ;
}
