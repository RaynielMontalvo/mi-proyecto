package com.example.Mi.Proyecto.expose;

import com.example.Mi.Proyecto.exception.NotFoundException;
import com.example.Mi.Proyecto.expose.dto.PlayerResponse;
import com.example.Mi.Proyecto.expose.dto.SavePlayerRequest;
import com.example.Mi.Proyecto.expose.dto.UpdatePlayerRequest;
import com.example.Mi.Proyecto.services.contract.IPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@ResponseBody @
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final IPlayerService service;


    //ResponseEntity control de estados HTTP
    @GetMapping
    public ResponseEntity<List<PlayerResponse>> getall() throws NotFoundException {
        return new ResponseEntity(service.getall(), HttpStatus.OK);
    }


    @GetMapping("/find-by/{name}")
    public ResponseEntity<List<PlayerResponse>> findByName(@PathVariable("name") String name) {
        //return new ResponseEntity(service.getAll(), HttpStatus.OK);
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<PlayerResponse> findById(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok(service.findById(id));
    }
   // @PostMapping
    //public ResponseEntity<PlayerResponse> create(@RequestBody @Valid SavePlayerRequest player) {
       // service.create(player);
       // return new ResponseEntity(service.create(player), HttpStatus.CREATED);
    //}

    @PutMapping("/{id}")
    public ResponseEntity<PlayerResponse> update(@PathVariable long id , @RequestBody UpdatePlayerRequest player) {
        return ResponseEntity.ok(service.update(id, player));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
