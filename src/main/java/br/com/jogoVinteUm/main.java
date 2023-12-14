package br.com.jogoVinteUm;

import br.com.jogoVinteUm.models.CartaComprada;

import static br.com.jogoVinteUm.util.PontosUtil.calculaPontosObtidos;
import static br.com.jogoVinteUm.util.ComprarCartaUtil.comprarCarta;
import static br.com.jogoVinteUm.util.InterfaceUtil.*;

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
                System.out.println(carta);
                System.out.println("Obteve " + calculaPontosObtidos(carta) + " pontos");
                pontos += calculaPontosObtidos(carta);
                System.out.println("Pontos Totais: " + pontos + " pontos");
                if(pontos > 21){
                    jogoEstourado();
                    break;
                } else if (pontos == 21) {
                    jogoVencido(pontos);
                    break;
                }
            }else{
                jogoFinalizadoAntes(pontos);
                break;
            }
        }
       }
}
