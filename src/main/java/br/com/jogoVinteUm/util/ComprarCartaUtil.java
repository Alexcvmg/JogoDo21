package br.com.jogoVinteUm.util;

import br.com.jogoVinteUm.models.CartaComprada;
import br.com.jogoVinteUm.models.Deck;

public class ComprarCartaUtil {
    private static DeckUtil deckUtil = new DeckUtil();
    private static CartaCompradaUtil cartaCompradaUtil = new CartaCompradaUtil();
    private static Deck deck = deckUtil.novoBaralho();
    public static CartaComprada comprarCarta(){
        CartaComprada carta = cartaCompradaUtil.cartaComprada(deck);
        carta.obterValor();
        return carta;
    }

}
