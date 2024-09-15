package dev.antoniotorres.echateunazanga.zanga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import dev.antoniotorres.echateunazanga.zanga.services.PlayerService;

import dev.antoniotorres.echateunazanga.zanga.model.Player;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService PlayerService;

    @PostMapping("/player")
    public ResponseEntity<Player> createPlayer(@RequestBody String name) {
        Player player = PlayerService.createNewPlayer(name);
        return ResponseEntity.ok(player);
    } 

    
}
