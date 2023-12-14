package br.com.jogoVinteUm.models;

import lombok.Data;

import java.util.List;
@Data
public class CartaComprada {
    private boolean success;
    private String deckId;
    private List<Carta> cards;
    private int remaining;
    private String valor;

    public void obterValor(){
        Carta carta = cards.get(0);
        this.valor = carta.getValue();
    }

    public String getDeck_id() {
        return deckId;
    }

    public void setDeck_id(String deck_id) {
        this.deckId = deck_id;
    }

    @Override
    public String toString(){
        return "Carta Comprada: " + cards + " restam: " + remaining + " cartas";
    }
}
