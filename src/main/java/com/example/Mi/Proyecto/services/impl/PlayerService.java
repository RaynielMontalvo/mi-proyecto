package com.example.Mi.Proyecto.services.impl;


import com.example.Mi.Proyecto.exception.NotFoundException;
import com.example.Mi.Proyecto.expose.dto.PlayerResponse;
import com.example.Mi.Proyecto.expose.dto.SavePlayerRequest;
import com.example.Mi.Proyecto.expose.dto.UpdatePlayerRequest;
import com.example.Mi.Proyecto.persistence.entities.Player;
import com.example.Mi.Proyecto.persistence.repositories.NbaRepository;
import com.example.Mi.Proyecto.services.contract.IPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


@Service
@RequiredArgsConstructor
public class PlayerService implements IPlayerService {
    private final NbaRepository repository;

    @Override
    public List<PlayerResponse> getall() {
        return repository.findAll()
                .stream()
                .map(player -> mapToDTO(player))
                .collect(Collectors.toList());
    }
//        List<Player> playerList = repository.findAll()
//        List<PlayerResponse> playerResponses = playerList.stream()
//                .map(player)
//    }

    @Override
    public List<PlayerResponse> findByName(String name) {
        return null;
    }

    @Override
    public PlayerResponse findById(Long id) throws NotFoundException {
        return null;
    }

    @Override
    public PlayerResponse create(SavePlayerRequest playerRequest) {
        return null;
    }

    @Override
    public PlayerResponse update(Long id, UpdatePlayerRequest updatePlayerRequest) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


    //MAPEADOR O TRANSFORMADOR DE ENTIDADS A DTO
    private PlayerResponse mapToDTO(Player player) {
        PlayerResponse playerResponse = new PlayerResponse();
        playerResponse.setIdplayer(player.getIdplayer());
        playerResponse.setName(player.getName());
        playerResponse.setLastname(player.getLastname());
        playerResponse.setNumber(player.getNumber());
        return playerResponse;
    }

    //Mapear a entidad para poder guardar datos
//    private PlayerResponse mapToEntity(Player player) {
//
//        return playerResponse;
//    }

}
