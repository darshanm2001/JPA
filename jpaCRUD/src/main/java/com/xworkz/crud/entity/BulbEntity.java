package com.xworkz.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="bulb")
@AllArgsConstructor
@NoArgsConstructor
public class BulbEntity {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="brand")
    private String brand;

    @Column(name="light_type")
    private String light_type;

    @Column(name="special_feature")
    private String special_feature;

    @Column(name="shape_size")
    private String shape_size;

    @Column(name="incandescent_wattage")
    private String incandescent_wattage;

    @Column(name="color")
    private String color;

    @Column(name="voltage")
    private String voltage;

    @Column(name="net_quality")
    private int net_quality;
}
