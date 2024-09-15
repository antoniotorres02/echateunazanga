package dev.antoniotorres.echateunazanga.zanga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.antoniotorres.echateunazanga.zanga.model.ZangaGame;
import dev.antoniotorres.echateunazanga.zanga.services.GameService;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping("/createGames")
    public List<ZangaGame> createGames(@RequestBody Long numberOfGames) {
        return gameService.createGames(numberOfGames);
    }

    @GetMapping("/getGames")
    public List<ZangaGame> getGames() {
        return gameService.getGames();
    }


    
    
}
