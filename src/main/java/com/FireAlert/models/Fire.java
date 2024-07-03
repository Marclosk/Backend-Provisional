package com.FireAlert.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Fire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private int phone;

    @Column(name = "latitude")
    private int latitude;

    @Column(name = "longitude")
    private int longitude;

    @Column(name = "message")
    private int message;

}
