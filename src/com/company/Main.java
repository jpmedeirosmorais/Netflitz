package com.company;

import com.company.models.CartaoCredito;
import com.company.models.Usuario;
import com.company.models.usuario.Perfil;

public class Main {

    public static void main(String[] args) {
    Usuario usuarioJoao = new Usuario("João", "joao@email.com");
    Perfil jp = new Perfil("JP", usuarioJoao);


    CartaoCredito cartaoJoao = new CartaoCredito(151511113, true, usuarioJoao);



    try{
        usuarioJoao.getCartao(cartaoJoao);
        System.out.println("Pagamento efetuado com sucesso!");
    }catch (Exception cartaoVencido){
        System.out.println(cartaoVencido.getMessage());
    }


    }
}
