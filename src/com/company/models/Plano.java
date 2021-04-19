package com.company.models;

import java.nio.file.attribute.UserPrincipal;

public abstract class Plano {
    private String nomePlano;
    private int nivelAcesso;
    private Usuario usuario;
    private String resolucao;

    public Plano(String nomePlano, int nivelAcesso, String resolucao) {
        this.nomePlano = nomePlano;
        this.nivelAcesso = nivelAcesso;
        this.resolucao =  resolucao;

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
