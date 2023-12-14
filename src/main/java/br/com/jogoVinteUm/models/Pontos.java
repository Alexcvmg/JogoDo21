package br.com.jogoVinteUm.models;

public abstract class Pontos {
    public static int getValorNumerico(CartaComprada carta) {
        switch (carta.getValor()) {
            case "2": case "3": case "4": case "5":
            case "6": case "7": case "8": case "9":
                return Integer.parseInt(carta.getValor());
            case "10": case "JACK": case "QUEEN": case "KING":
                return 10;
            case "ACE":
                return 1;
            default:
                return 0;
        }
    }
}
