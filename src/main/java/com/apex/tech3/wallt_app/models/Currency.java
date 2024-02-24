package com.apex.tech3.wallt_app.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "currencies", schema = "wallt_db")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_sequence")
    @SequenceGenerator(name = "currency_sequence", sequenceName = "increment_SEQ", allocationSize = 1)
    @Column(name = "currency_id")
    private int id;
    @Column(name = "name")
    private String name;
}