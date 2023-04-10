package com.example.Mi.Proyecto.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "awards")
public class Awards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_award")
    private Long idaward;

    @Column(name = "awardsamount")
    private Long amount;

    @Column(name = "mvp")
    private String mvp;

    @Column(name = "dpoy")
    private String dpoy;

    @Column(name = "fmvp")
    private String fmvp;

    @Column(name = "scorechamp")
    private String scorechamp;

    @Column(name = "astchamp")
    private String astchamp;

    @Column(name = "blockchamp")
    private String blockchamp;

    @Column(name = "rebountchamp")
    private String rebountchamp;

    @Column(name = "year_of_award")
    private String awardyear;

//    @ManyToOne
//    @JoinColumn(name = "player_id", nullable=false)
//    private Player player;

}
