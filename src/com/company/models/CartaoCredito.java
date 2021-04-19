package com.company.models;

public class CartaoCredito {
    private int numeroCartao;
    private boolean vencido;
    private Usuario usuario;

    public CartaoCredito(int numeroCartao, boolean vencido, Usuario usuario) {
        this.numeroCartao = numeroCartao;
        this.vencido = vencido;
        this.usuario = usuario;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
