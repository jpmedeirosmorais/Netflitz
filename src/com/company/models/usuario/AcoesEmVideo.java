package com.company.models.usuario;

import com.company.models.Midia;
import com.company.models.Usuario;

public interface AcoesEmVideo {
    void setAberto(boolean statusAberto, Midia midia);
    void setPause(boolean statusPause, Midia midia) throws Exception;
    void setResolucao(Usuario usuario, Midia midia) throws Exception;
}
