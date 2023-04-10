package com.example.Mi.Proyecto.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "file")
public class PlayerFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_files")
    private Long idfiles;

    @Column(name = "age")
    private Integer age;

    @Column(name = "weight")
    private String weigth;

    @Column(name = "height")
    private String height;

    @Column(name = "nationality")
    private String nationality;

//    @OneToOne(mappedBy = "file")
//    private Player player;


}
