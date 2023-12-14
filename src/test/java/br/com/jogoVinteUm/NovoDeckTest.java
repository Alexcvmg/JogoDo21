package br.com.jogoVinteUm;

import br.com.jogoVinteUm.models.CartaComprada;
import br.com.jogoVinteUm.models.Deck;
import br.com.jogoVinteUm.util.CartaCompradaUtil;
import br.com.jogoVinteUm.util.DeckUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class NovoDeckTest {
    Logger logger = LoggerFactory.getLogger(NovoDeckTest.class);
    @Test
    @DisplayName("Verifica se o um deck novo foi realmente comprado")
    public void compraDeck(){
        DeckUtil deckUtil = new DeckUtil();
        Deck deck = deckUtil.novoBaralho();
        assertTrue(deck.isSuccess());
        logger.info("Passou no teste e foi criado um deck novo!");

    }
    @Test
    @DisplayName("Verifica se uma carta foi comprada no deck")
    public void comprarCarta(){
        DeckUtil deckUtil = new DeckUtil();
        Deck deck = deckUtil.novoBaralho();
        CartaCompradaUtil cartaCompradaUtil = new CartaCompradaUtil();
        CartaComprada cartaComprada = cartaCompradaUtil.cartaComprada(deck,1);
        assertTrue(cartaComprada.isSuccess());
        logger.info("Passou no teste e a carta foi comprada!");

    }
    @Test
    @DisplayName("Testa se passar um valor negativo de cartas a serem compradas")
    public void testarCompraNegativa(){
        DeckUtil deckUtil = new DeckUtil();
        Deck deck = deckUtil.novoBaralho();
        CartaCompradaUtil cartaCompradaUtil = new CartaCompradaUtil();
        assertThrows(RuntimeException.class, () ->{
           cartaCompradaUtil.cartaComprada(deck,-5);
        });
        logger.info("Passou no teste e lançou a exceção!");
    }
}
