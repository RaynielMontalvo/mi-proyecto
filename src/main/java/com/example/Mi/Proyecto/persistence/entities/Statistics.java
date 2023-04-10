package com.example.Mi.Proyecto.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stats")
    private Long idstats;

    @Column(name="ppg")
    private Float ppg;

    @Column(name="apg")
    private Float apg;

    @Column(name="rpg")
    private Float rpg;

    @Column(name="bpg")
    private Float bpg;

    @Column(name="minpg")
    private Float minpg;

    @Column(name="spg")
    private Float spg;

    @Column(name="topg")
    private Float topg;

//    @OneToMany
//    @JoinColumn(name = "player_id", nullable=false)
//    private Player player;
}
