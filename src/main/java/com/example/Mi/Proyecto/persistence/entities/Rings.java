package com.example.Mi.Proyecto.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rings")
public class Rings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ring")
    private Long idring;

    @Column(name = "amount")
    private String amount;

    @Column(name = "year")
    private String year;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "file_id")
//    private PlayerFile pfile;
//
//    @OneToOne(mappedBy="player_id")
//    private List<Player> player;

}
