package com.company;

import com.company.models.CartaoCredito;
import com.company.models.Usuario;
import com.company.models.exceptions.CartaoSemSaldoException;
import com.company.models.exceptions.CartaoVencido;
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

        Usuario joao = new Usuario("João", "joao@email.com");
        Usuario marcos = new Usuario("Marcos", "marcos@email.com");

        Perfil jp = new Perfil("JP", joao);
        Perfil mv = new Perfil("MV", marcos);

        Serie breakingBad = new Serie("Breaking Bad");
        Serie naruto = new Serie("Naruto Shippuden");

        Filme elCamino = new Filme("El Camino");
        Filme aProcuraDeUmMilagre = new Filme("A procura de um milagre");

        PlanoBasico planoBasico = new PlanoBasico("Plano Básico", 1, "720p", 21.9);
        PlanoIntermediario planoIntermediario = new PlanoIntermediario("Plano Intermedriário", 2,"1080p", 32.9);
        PlanoPremium planoPremium = new PlanoPremium("Plano Premium", 3, "2160",45.9);

        CartaoCredito cartaoJoao = new CartaoCredito(151511113, false, joao, 30.5);
        CartaoCredito cartaoMarcos = new CartaoCredito(151352135, false, marcos, 202.3);

        joao.setPlano(planoBasico);
        marcos.setPlano(planoPremium);

        jp.setAberto(true, elCamino);


        try{
            joao.getPagamento(cartaoJoao);//tenta efetuar o pagamento.
            System.out.println("Pagamento efetuado com sucesso!");
        }catch (CartaoVencido e){
            System.out.println(e.getMessage());
        }catch (CartaoSemSaldoException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            jp.setResolucao(joao, elCamino);
            System.out.println("Resolução da midia em "+elCamino.getResolucao());
        }catch (Exception videoFechado){
            System.out.println(videoFechado.getMessage());
        }

        status.statusUsuario(joao);
        status.statusMidia(breakingBad);
        status.statusMidia(elCamino);
        status.statusPlano(joao.getPlano());
        status.statusCartaoCredito(cartaoJoao);
    }
}
