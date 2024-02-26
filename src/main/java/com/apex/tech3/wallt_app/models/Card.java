package com.apex.tech3.wallt_app.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "cards", schema = "wallt_db")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_sequence")
    @SequenceGenerator(name = "card_sequence", sequenceName = "increment_SEQ", allocationSize = 1)
    @Column(name = "card_id")
    private int id;
    @Column(name = "first_last_name")
    private String firstLastName;
    @Column(name = "number")
    private String number;
    @Column(name = "expiration_date")
    private LocalDate expirationDate;
    @Column(name = "cvv")
    private String cvv;
    @ManyToOne
    @JoinColumn(name = "holder_id")
    private User holder;
    @Column(name = "stamp_created")
    private Timestamp stampCreated;
}
