package com.company.models.usuario;

import com.company.models.CartaoCredito;
import com.company.models.Usuario;

public interface AcoesPagamento {
    boolean getPagamento(CartaoCredito cartaoCredito) throws Exception;//edita os dados do cartão
}
