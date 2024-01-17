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
@Table(name="traffic_fine")
@AllArgsConstructor
@NoArgsConstructor
public class TrafficFineEntity {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="violation")
    private String violation;


    @Column(name="vehicleNo")
    private String vehicleNo;

    @Column(name="vehicleOwner")
    private String vehicleOwner;

    @Column(name="fine")
    private int fine;
}
