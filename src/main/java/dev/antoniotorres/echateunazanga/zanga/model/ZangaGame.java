package dev.antoniotorres.echateunazanga.zanga.model;

import java.util.ArrayList;
import java.util.List;

public class ZangaGame {

    private List<Player> players;

    public ZangaGame() {
        this.players = new ArrayList<>(4); // Inicializamos la lista con capacidad para 4 jugadores
    }

    public boolean addPlayer(Player player) {
        if (players.size() < 4) {
            return players.add(player);
        }
        return false; // Devuelve false si ya hay 4 jugadores
    }

    public List<Player> getPlayers() {
        return players;
    }

}
