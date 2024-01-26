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
@Table(name="email")
@AllArgsConstructor
public class EmailEntity {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="address")
    private String address;


    @Column(name="from")
    private String from;

    @Column(name="to")
    private String to;

    @Column(name="subject")
    private String subject;

    @Column(name="sendDate")
    private LocalDate sendDate;

    @Column(name="success")
    private String success;



}
