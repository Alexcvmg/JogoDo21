package br.com.jogoVinteUm.util;

public abstract class InterfaceUtil {
    public static void mensagemInicial(){
        System.out.println("************************************************");
        System.out.println("****** Bem-vindo ao Jogo de 21 Individual ******");
        System.out.println("****   Some pontos até dar 21 ou estourar   ****");
        System.out.println("************************************************");
    }

    public static void  mensagemDeOpcao(){
        System.out.println("******************* Escolha: *******************");
        System.out.println("1: Comprar uma carta");
        System.out.println("2: Parar");
        System.out.println("************************************************");
    }

    public static void jogoFinalizadoAntes(int pontos){
        System.out.println("Fim do Programa!");
        System.out.println("Pontos Obtidos: " + pontos + " pontos");
    }

    public static void jogoVencido(int pontos){
        System.out.println("Parabens! Você venceu, obteve os 21 pontos!");
    }

    public static void jogoEstourado(){
        System.out.println("Estourou! Você ultrapassou os 21 pontos!");
    }
}
