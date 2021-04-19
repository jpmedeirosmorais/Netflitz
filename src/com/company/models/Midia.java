package com.company.models;

import java.util.ResourceBundle;

public class Midia {
    private String titulo;
    private String resolucao;



    public Midia(String titulo) {
        this.titulo = titulo;
        this.resolucao = "720p";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
