package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="super_hero")
@AllArgsConstructor
public class SuperHeroEntity {

    @Id
    @Column(name="s_id")
    private int s_id;

    @Column(name="s_real_name")
    private String s_real_name;

    @Column(name="s_fictional_name")
    private String s_fictional_name;

    @Column(name="s_power")
    private String s_power;

    @Column(name="s_country")
    private String s_country;

    @Column(name=" s_weakness")
    private String s_weakness;
}
