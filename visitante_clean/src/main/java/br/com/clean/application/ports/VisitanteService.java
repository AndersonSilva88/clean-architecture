package br.com.clean.application.ports;

import br.com.clean.application.dto.VisitanteDTO;
import br.com.clean.application.entities.Visitante;

import java.util.Objects;

public class VisitanteService implements VisitanteServicePort{

    public VisitanteRepositoryPort repository;

    public VisitanteService(VisitanteRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrar(VisitanteDTO dto){
        if (Objects.isNull(dto)){
            throw new IllegalArgumentException("falta informações do visitante");
        }
        var visitante = new Visitante(dto.getNome(), dto.getCpf(), dto.getFoto());

        this.repository.cadastrar(visitante);
    }

}
