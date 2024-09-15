package dev.antoniotorres.echateunazanga.zanga.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.antoniotorres.echateunazanga.zanga.model.Player;
import dev.antoniotorres.echateunazanga.zanga.model.ZangaGame;

@Service
public class GameService {

    Map<UUID, ZangaGame> games;


    GameService() {
        this.games = new HashMap<>();
    }



    public List<ZangaGame> createGames(Long numberOfGames) {
        List<ZangaGame> result = new ArrayList<>();
        for (int i = 0; i < numberOfGames; i++) {
            ZangaGame game = new ZangaGame();
            games.put(game.getId(), game);
            result.add(game);
        }
        return result;
    }

    public List<ZangaGame> getGames() {
        return List.copyOf(games.values());
    }


    public ZangaGame joinGame(Player player, UUID gameId) {
        ZangaGame game = games.get(gameId);
        game.addPlayer(player);
        return game;
    }

}

