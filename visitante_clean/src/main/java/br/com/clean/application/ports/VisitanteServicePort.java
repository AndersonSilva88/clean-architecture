package br.com.clean.application.ports;

import br.com.clean.application.dto.VisitanteDTO;

public interface VisitanteServicePort {

    void cadastrar(VisitanteDTO dto);
}
