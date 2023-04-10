package com.example.Mi.Proyecto.persistence.repositories;

import com.example.Mi.Proyecto.persistence.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NbaRepository extends JpaRepository<Player, Long> {
}
