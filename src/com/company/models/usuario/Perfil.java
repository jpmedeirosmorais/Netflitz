package com.company.models.usuario;

import com.company.models.Midia;
import com.company.models.Usuario;
import com.company.models.exceptions.VideoFechadoException;
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
    public void setAberto(boolean statusAberto, Midia midia) {
            midia.setAberto(statusAberto);
    }

    @Override
    public void setPause(boolean statusPause, Midia midia) throws Exception{
        if (midia.getAberto()){
            midia.setPause(statusPause);
        }
        throw new VideoFechadoException();
    }

    @Override
    public void setResolucao(Usuario usuario, Midia midia) throws Exception{
        if (midia.getAberto()) {
            midia.setResolucao(usuario.getPlano().getResolucao());
        }else {
            throw new VideoFechadoException();
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
