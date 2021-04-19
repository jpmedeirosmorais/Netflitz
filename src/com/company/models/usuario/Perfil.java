package com.company.models.usuario;

import com.company.models.Midia;
import com.company.models.Usuario;
import com.company.models.midia.Filme;
import com.company.models.midia.Serie;

public class Perfil implements AcoesEmVideo {
    private String nome;
    private Usuario usuario;
    private Serie serie;
    private Filme filme;

    public Perfil(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }

    @Override
    public boolean setAberto(boolean statusAberto, Midia midia) {
        return statusAberto;
    }

    @Override
    public boolean setPause(boolean statusPause, Midia midia) {
        return statusPause;
    }

    @Override
    public void setResolucao(Usuario usuario) throws Exception{
        if(usuario.getPlano().getNivelAcesso() == 1){
            usuario.
        }else if(usuario.getPlano().getNivelAcesso() == 2){

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
