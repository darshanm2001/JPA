package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="jpa.film")
@AllArgsConstructor
public class FilmEntity {


    @Id
    @Column(name="f_id")
    private int f_id;

    @Column(name="f_name")
    private String f_name;

    @Column(name="f_actor")
    private String f_actor;

    @Column(name="f_director")
    private String f_director;

    @Column(name="f_producer")
    private String f_producer;

}
