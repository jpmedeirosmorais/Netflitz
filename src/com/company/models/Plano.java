package com.company.models;

import java.nio.file.attribute.UserPrincipal;

public abstract class Plano {
    private String nomePlano;
    private int nivelAcesso;
    private Usuario usuario;
    private String resolucao;
    private double valor;

    public Plano(String nomePlano, int nivelAcesso, String resolucao, double valor) {
        this.nomePlano = nomePlano;
        this.nivelAcesso = nivelAcesso;
        this.resolucao =  resolucao;
        this.valor = valor;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}
