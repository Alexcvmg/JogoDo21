package br.com.jogoVinteUm.util;

import br.com.jogoVinteUm.models.CartaComprada;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.http.HttpResponse;

import static br.com.jogoVinteUm.util.PontosUtil.calculaPontosObtidos;

public abstract class InterfaceUtil {
    private static Logger  logger = LoggerFactory.getLogger(InterfaceUtil.class);
    public static void mensagemInicial(){
        logger.info("************************************************");
        logger.info("****** Bem-vindo ao Jogo de 21 Individual ******");
        logger.info("****   Some pontos até dar 21 ou estourar   ****");
        logger.info("************************************************");
        logger.info("                                                 ");

    }

    public static void  mensagemDeOpcao(){
        logger.info("******************* Escolha: *******************");
        logger.info("1: Comprar uma carta");
        logger.info("2: Parar");
        logger.info("************************************************");
    }

    public static void jogoFinalizadoAntes(int pontos){
        logger.info("Fim do Programa!");
        logger.info("Pontos Obtidos: " + pontos + " pontos");
    }

    public static void jogoVencido(int pontos){
        logger.info("Parabens! Você venceu, obteve os 21 pontos!");
    }

    public static void jogoEstourado(){
        logger.info("Estourou! Você ultrapassou os 21 pontos!");
    }

    public static void pontosObtidos(CartaComprada carta, int pontos){
        logger.info("Obteve " + calculaPontosObtidos(carta) + " pontos");
        logger.info("Pontos Totais: " + pontos + " pontos");
    }

    public static void mostrarCartaComprada(CartaComprada carta){
        logger.info(carta.toString());
    }

    public static void imprimirStatusCode(HttpResponse<String> response){
        logger.info("Status Code: " + response.statusCode());
    }

    public static void opcaoInvalida(){
        logger.info("Opção Inválida!");
    }
}
