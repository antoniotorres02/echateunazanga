package dev.antoniotorres.echateunazanga.zanga.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ZangaGame {

    List<Player> players;
    GameStatus status; 
    UUID id;

    public ZangaGame() {
        this.id = UUID.randomUUID();
        this.players = new ArrayList<>(4);
        this.status = GameStatus.WAITING;
    }

    private enum GameStatus {
        WAITING, STARTED, FINISHED
    }



    public Boolean addPlayer(Player player) {
        if (players.size() < 4) {
            if (players.size() == 3) {
                startGame();
            }
            return players.add(player);
        }
        return false; // Devuelve false si ya hay 4 jugadores
    }

    private void startGame() {
        status = GameStatus.STARTED;
    }


    

    public List<Player> getPlayers() {
        return players;
    }

}
