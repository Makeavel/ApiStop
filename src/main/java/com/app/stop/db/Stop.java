package com.app.stop.db;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "stop")
public class Stop {


    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Integer id;
    @Id
    private String letra;
    private String nome;
    private String sobrenome;
    private String animal;
    private String bebidas;
    private String banda;
    private String cor;
    private String cidade;
    private String comida;
    private String carro;
    private String doce;
    private String eletronico;
    private String esporte;
    private String flor;
    private String filme;
    private String frutaLegumeVerdura;
    private String idioma;
    private String jogo;
    private String marca;
    private String mse;
    private String musica;
    private String objeto;
    private String profissao;
    private String pais;
    private String pch;
    private String site;
    private String time;
    private String verbo;

    public String getLetra(){
        return letra;
    }

}
