package com.xworkz.salar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="shop")
@AllArgsConstructor
public class ShopEntity {
    @Id
    @Column(name="s_id")
    private int s_id;

    @Column(name="s_name")
    private String s_name;

    @Column(name="s_location")
    private String s_location;

    @Column(name="s_owner")
    private String s_owner;

    @Column(name="s_gst_no")
    private String s_gst_no;
}
