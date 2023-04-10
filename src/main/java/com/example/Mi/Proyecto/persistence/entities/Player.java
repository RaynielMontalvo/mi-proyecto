package com.example.Mi.Proyecto.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_player")
    private Long idplayer;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "number")
    private String number;

    @Column(name = "nickname")
    private String nickname;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "file_id")
//    private PlayerFile pfile;
//
//    @OneToMany(mappedBy="statistics")
//    private List<Statistics> stat;
//
//    @ManyToOne
//    @JoinColumn(name = "ring_id", nullable=false)
//    private Rings ring;

//    @OneToMany(mappedBy="awards")
//    private List<Awards> award;

}
