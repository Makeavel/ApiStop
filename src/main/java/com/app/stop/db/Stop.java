package com.app.stop.db;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Stop {


    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Integer id;
    @Id
    private String letra;
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private String animal;
    @Column
    private String bebidas;
    @Column
    private String banda;
    @Column
    private String cor;
    @Column
    private String cidade;
    @Column
    private String comida;
    @Column
    private String carro;
    @Column
    private String doce;
    @Column
    private String eletronico;
    @Column
    private String esporte;
    @Column
    private String flor;
    @Column
    private String filme;
    @Column(name = "flv")
    private String frutaLegumeVerdura;
    @Column
    private String idioma;
    @Column
    private String jogo;
    @Column
    private String marca;
    @Column
    private String mse;
    @Column
    private String musica;
    @Column
    private String objeto;
    @Column
    private String profissao;
    @Column
    private String pais;
    @Column
    private String pch;
    @Column
    private String site;
    @Column
    private String time;
    @Column
    private String verbo;

    public String getLetra(){
        return letra;
    }

}
