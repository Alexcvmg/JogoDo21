package br.com.jogoVinteUm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ImagensCartasCompradas {
    private String svg;
    private String png;
}
