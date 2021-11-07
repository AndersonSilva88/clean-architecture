package br.com.clean.application.ports;

import br.com.clean.application.entities.Visitante;

public interface VisitanteRepositoryPort {

    void cadastrar(Visitante visitante);
}
