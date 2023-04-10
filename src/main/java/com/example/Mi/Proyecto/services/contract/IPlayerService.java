package com.example.Mi.Proyecto.services.contract;

import com.example.Mi.Proyecto.exception.NotFoundException;
import com.example.Mi.Proyecto.expose.dto.PlayerResponse;
import com.example.Mi.Proyecto.expose.dto.SavePlayerRequest;
import com.example.Mi.Proyecto.expose.dto.UpdatePlayerRequest;

import java.util.List;

public interface IPlayerService {
    List<PlayerResponse> getall() throws NotFoundException;

    List<PlayerResponse> findByName(String name);

    PlayerResponse findById(Long id) throws NotFoundException;

    PlayerResponse create(SavePlayerRequest playerRequest);

    PlayerResponse update(Long id, UpdatePlayerRequest updatePlayerRequest);

    void delete(Long id);



}
