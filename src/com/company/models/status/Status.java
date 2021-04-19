package com.company.models.status;

import com.company.models.CartaoCredito;
import com.company.models.Midia;
import com.company.models.Plano;
import com.company.models.Usuario;
import com.company.models.exceptions.VideoFechadoException;
import com.company.models.usuario.Perfil;

public class Status {
    private Usuario usuario;
    private Perfil perfil;
    private Midia midia;
    private Plano plano;
    private CartaoCredito cartaoCredito;

    public Status() {
    }

    public void statusUsuario(Usuario usuario){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email: "+usuario.getEmail());
        System.out.println("--------------------------");
        System.out.println("");
    }
    public void statusPerfil(Perfil perfil){
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Conta do perfil");


        System.out.println("--------------------------");
        System.out.println("");
    }
    public void statusMidia(Midia midia){
        System.out.println("");
        System.out.println("--------------------------");


        System.out.println("--------------------------");
        System.out.println("");
    }
    public void statusPlano(Plano plano){
        System.out.println("");
        System.out.println("--------------------------");


        System.out.println("--------------------------");
        System.out.println("");
    }
    public void statusCartaoCredito(CartaoCredito cartaoCredito){
        System.out.println("");
        System.out.println("--------------------------");


        System.out.println("--------------------------");
        System.out.println("");
    }

}
