package one;

import br.com.clean.application.entities.Visitante;
import br.com.clean.application.ports.VisitanteRepositoryPort;

import java.util.Hashtable;

public class TabelaVisitanteEmMemoria implements VisitanteRepositoryPort {

    private Hashtable<String, Visitante> repository;

    public TabelaVisitanteEmMemoria(){
        this.repository = new Hashtable<>();
    }

    @Override
    public void cadastrar(Visitante visitante) {
        this.repository.put(visitante.getCpf(), visitante);
    }
}
