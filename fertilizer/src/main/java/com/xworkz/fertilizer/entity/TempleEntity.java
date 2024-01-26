package com.xworkz.fertilizer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@Table(name="temple")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAllByLocation",query = "select et from TempleEntity et where et.location=:lo")
@NamedQuery(name="findAllByEntryFeeGreaterThan",query = "select ent from TempleEntity ent where ent.entryFee>:gr ")
@NamedQuery(name="findAllByEntryInagrudateDateGreaterThan",query = "select ent from TempleEntity ent where ent.inagurateDate>:dm ")
@NamedQuery(name="findById",query = "select et from TempleEntity et where et.id=:dd")
@NamedQuery(name="findByIdMainGod",query = "select et from TempleEntity et where et.id=:id AND et.mainGod=:mainGod ")
@NamedQuery(name="findAllByEntryFeeBetween",query = "select et from TempleEntity et where et.entryFee BETWEEN :startFee AND :endFee")
@NamedQuery(name="findTotal",query = "select COUNT(et) From TempleEntity et ")

public class TempleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="name")
    @NonNull
    private String name;


    @Column(name="location")
    @NonNull
    private String location;


    @Column(name="entryFee")
    @NonNull
    private double entryFee;

    @Column(name="vipEntery")
    @NonNull
    private double vipEntry;


    @Column(name="inagurateDate")
    @NonNull
    private LocalDate inagurateDate;


    @Column(name="mainGod")
    @NonNull
    private String mainGod;



}
