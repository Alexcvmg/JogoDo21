package br.com.jogoVinteUm.models;

import lombok.Data;

@Data
public class Carta {
    private String code;
    private String image;
    private ImagensCartasCompradas images;
    private String value;
    private String suit;

    @Override
    public String toString(){
        return value + "-" + suit;
    }


}
