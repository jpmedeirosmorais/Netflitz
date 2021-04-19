package com.company.models;

import com.company.models.exceptions.CartaoVencido;
import com.company.models.usuario.AcoesPagamento;
import com.company.models.usuario.Perfil;

public class Usuario implements AcoesPagamento {
    private String nome;
    private String email;
    private CartaoCredito cartaoCredito;
    private Perfil perfil;
    private Plano plano;


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean getPagamento(CartaoCredito cartaoCredito)throws Exception{
        if(cartaoCredito.isVencido()){
            throw new CartaoVencido();
        }
            return cartaoCredito.isVencido();
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
