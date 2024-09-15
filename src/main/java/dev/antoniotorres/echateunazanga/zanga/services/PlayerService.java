package dev.antoniotorres.echateunazanga.zanga.services;

import org.springframework.stereotype.Service;

import dev.antoniotorres.echateunazanga.zanga.model.Player;

@Service
public class PlayerService {

    public Player createNewPlayer(String name) {
        return new Player(name);
    }
    
}
