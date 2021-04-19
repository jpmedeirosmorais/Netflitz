package com.company.models.usuario;

import com.company.models.Midia;
import com.company.models.Usuario;

public interface AcoesEmVideo {
    boolean setAberto(boolean statusAberto, Midia midia);
    boolean setPause(boolean statusPause, Midia midia);
    void setResolucao(Usuario usuario) throws Exception;
}
