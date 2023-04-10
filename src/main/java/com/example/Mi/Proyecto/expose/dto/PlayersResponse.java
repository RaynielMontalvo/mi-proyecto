package com.example.Mi.Proyecto.expose.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlayersResponse {
    private List<PlayerResponse> players;
}
