package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="jpa.traffic")
@AllArgsConstructor
public class TrafficEntity {
    @Id
    @Column(name="t_id")
    private int t_id;

    @Column(name="t_color")
    private String t_color;

    @Column(name="t_area")
    private String t_area;

    @Column(name="t_time")
    private String t_time;

    @Column(name="t_no_vehicle")
    private int t_no_vehicle;
}
