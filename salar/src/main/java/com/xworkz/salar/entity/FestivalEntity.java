package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="festival")
@AllArgsConstructor
public class FestivalEntity {
    @Id
    @Column(name="f_id")
    private int f_id;

    @Column(name="f_name")
    private String f_name;

    @Column(name="f_month")
    private String f_month;

    @Column(name="year")
    private  int year;

    @Column(name="celebrated_country")
    private String celebrated_country;
}
