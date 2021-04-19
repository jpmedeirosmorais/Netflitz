package com.company.models;

import java.nio.file.attribute.UserPrincipal;

public abstract class Plano {
    private String nomePlano;
    private int nivelAcesso;
    private Usuario usuario;

    public Plano(String nomePlano, int nivelAcesso) {
        this.nomePlano = nomePlano;
        this.nivelAcesso = nivelAcesso;
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
}
