package com.xworkz.fertilizer.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@Table(name="fertilizer")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAllByQuantity",query ="select et from FertilizerEntity et where et.quantity=:qt")
public class FertilizerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="f_name")
    @NonNull
    private String fname;

    @Column(name="quantity")
    @NonNull
    private int quantity;

    @Column(name="cost")
    @NonNull
    private double cost;

    @Column(name="manfDate")
    @NonNull
    private LocalDate manfDate;

    @Column(name="expDate")
    @NonNull
    private LocalDate expDate;
}
