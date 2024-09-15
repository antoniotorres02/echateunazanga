package dev.antoniotorres.echateunazanga.zanga.model;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;

    public Player(String name) {
        this.id = UUID.randomUUID(); 
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
