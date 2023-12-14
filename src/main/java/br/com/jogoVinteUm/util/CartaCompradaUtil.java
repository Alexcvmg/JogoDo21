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

import static br.com.jogoVinteUm.util.InterfaceUtil.imprimirStatusCode;

public class CartaCompradaUtil {
    public CartaComprada cartaComprada(Deck deck, int quantidade){
        if(quantidade <= 0 || quantidade >51){
            throw new RuntimeException("Quantidade Inválida");
        }
        String uri = "https://deckofcardsapi.com/api/deck/" + deck.getDeck_id() +"/draw/?count=" + quantidade;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI(uri))
                    .version(HttpClient.Version.HTTP_2)
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            imprimirStatusCode(response);
            if(response.statusCode() != 200){
                throw new RuntimeException(response.body());
            }
            ObjectMapper objectMapper = new ObjectMapper();
            CartaComprada cartaComprada = objectMapper.readValue(response.body(), CartaComprada.class);
            return cartaComprada;
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
