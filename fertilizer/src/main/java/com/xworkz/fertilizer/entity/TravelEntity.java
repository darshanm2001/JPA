package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Data
@Table(name="travel")
@AllArgsConstructor
public class TravelEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="source")
    private String source;


    @Column(name="destination")
    private String destination;

    @Column(name="budget")
    private double budget;

    @Column(name="distance")
    private String distance;

    @Column(name="purpose")
    private String purpose;

    @Column(name="duration")
    private String duration;

    @Column(name="modeType")
    private String modeType;

    @Column(name="travelDate")
    private LocalDate travelDate;

    @Column(name="returnDate")
    private LocalDate returnDate;

}
