package com.company.models;

import java.util.ResourceBundle;

public class Midia {
    private String titulo;
    private String resolucao;
    private Boolean pause;
    private Boolean aberto;

    public Midia(String titulo) {
        this.titulo = titulo;
        this.resolucao = "720p";
        this.pause = true;
        this.aberto = false;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Boolean getPause() {
        return pause;
    }

    public void setPause(Boolean pause) {
        this.pause = pause;
    }

    public void setResolucao() {

    }
}
