package br.com.jogoVinteUm;

import br.com.jogoVinteUm.models.CartaComprada;

import static br.com.jogoVinteUm.models.Pontos.getValorNumerico;
import static br.com.jogoVinteUm.util.ComprarCartaUtil.comprarCarta;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        int pontos = 0;
        CartaComprada carta;
        mensagemInicial();

        while (pontos < 21){
            mensagemDeOpcao();
            escolha = sc.nextInt();
            if(escolha == 1){
                carta = comprarCarta();
                System.out.println("A carta comprada foi: " + carta);
                System.out.println("Obteve " + getValorNumerico(carta) + " pontos");
                pontos += getValorNumerico(carta);
                System.out.println("Pontos Totais: " + pontos + " pontos");
                if(pontos > 21){
                    System.out.println("Estourou! Você ultrapassou os 21 pontos!");
                    break;
                } else if (pontos == 21) {
                    System.out.println("Parabens! Você venceu, obteve os 21 pontos!");
                    break;
                }
            }else{
                System.out.println("Fim do Programa!");
                System.out.println("Pontos Obtidos: " + pontos + " pontos");
                break;
            }
        }

       }

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
}
