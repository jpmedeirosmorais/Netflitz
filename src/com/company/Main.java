package com.company;

import com.company.models.CartaoCredito;
import com.company.models.Usuario;
import com.company.models.midia.Filme;
import com.company.models.midia.Serie;
import com.company.models.plano.PlanoBasico;
import com.company.models.plano.PlanoIntermediario;
import com.company.models.plano.PlanoPremium;
import com.company.models.status.Status;
import com.company.models.usuario.Perfil;

public class Main {

    public static void main(String[] args) {
        Status status = new Status();
        Usuario usuarioJoao = new Usuario("João", "joao@email.com");
        Perfil jp = new Perfil("JP", usuarioJoao);
        Serie breakingBad = new Serie("Breaking Bad");
        Filme elCamino = new Filme("El Camino");
        PlanoBasico planoBasico = new PlanoBasico("Plano Básico", 1, "720p");
        PlanoIntermediario planoIntermediario = new PlanoIntermediario("Plano Intermedriário", 2,"1080p");
        PlanoPremium planoPremium = new PlanoPremium("Plano Premium", 3, "2160");

        usuarioJoao.setPlano(planoPremium);
        CartaoCredito cartaoJoao = new CartaoCredito(151511113, false, usuarioJoao);
        jp.setAberto(true, elCamino);


        try{
            usuarioJoao.getPagamento(cartaoJoao);//tenta efetuar o pagamento.
            System.out.println("Pagamento efetuado com sucesso!");
        }catch (Exception cartaoVencido){
            System.out.println(cartaoVencido.getMessage());
        }

        try {
            jp.setResolucao(usuarioJoao, elCamino);
            System.out.println(elCamino.getResolucao());
        }catch (Exception videoFechado){
            System.out.println(videoFechado.getMessage());
        }

        status.statusUsuario(usuarioJoao);
    }
}
