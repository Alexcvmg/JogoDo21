package br.com.jogoVinteUm.models;

import lombok.Data;

@Data
public class Deck {
    private boolean success;
    private String deck_id;
    private int remaining;
    private boolean shuffled;
}
