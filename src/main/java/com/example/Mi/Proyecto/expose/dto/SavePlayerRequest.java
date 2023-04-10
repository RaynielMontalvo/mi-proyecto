package com.example.Mi.Proyecto.expose.dto;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
@Getter
@Setter
public class SavePlayerRequest {
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String number;

}
