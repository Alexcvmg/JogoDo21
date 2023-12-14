package br.com.jogoVinteUm.util;

import br.com.jogoVinteUm.models.CartaComprada;
import br.com.jogoVinteUm.models.Deck;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CartaCompradaUtil {
    public CartaComprada cartaComprada(Deck deck){
        String uri = "https://deckofcardsapi.com/api/deck/" + deck.getDeck_id() +"/draw/?count=1";
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI(uri))
                    .version(HttpClient.Version.HTTP_2)
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            CartaComprada cartaComprada = objectMapper.readValue(response.body(), CartaComprada.class);
            return cartaComprada;
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
