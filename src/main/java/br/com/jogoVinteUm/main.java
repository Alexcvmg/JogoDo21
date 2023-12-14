package br.com.jogoVinteUm;

import br.com.jogoVinteUm.models.CartaComprada;

import static br.com.jogoVinteUm.util.PontosUtil.calculaPontosObtidos;
import static br.com.jogoVinteUm.util.ComprarCartaUtil.comprarCarta;
import static br.com.jogoVinteUm.util.InterfaceUtil.*;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha;
        int pontos = 0;
        CartaComprada carta;
        mensagemInicial();

        while (pontos < 21){
            mensagemDeOpcao();
            escolha = sc.next();
            if(escolha.equals("1")){
                carta = comprarCarta();
                mostrarCartaComprada(carta);
                pontos += calculaPontosObtidos(carta);
                pontosObtidos(carta, pontos);
                if(pontos > 21){
                    jogoEstourado();
                    break;
                } else if (pontos == 21) {
                    jogoVencido(pontos);
                    break;
                }
            }else if(escolha.equals("2")){
                jogoFinalizadoAntes(pontos);
                break;
            }else{
                opcaoInvalida();
            }
        }
       }
}
