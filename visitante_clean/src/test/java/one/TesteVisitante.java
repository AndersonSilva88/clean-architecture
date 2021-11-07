package one;

import br.com.clean.application.dto.VisitanteDTO;
import br.com.clean.application.ports.VisitanteService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TesteVisitante {

    @Test
    void deveCadastrarUmVisitante() {
        var nome = "Visitante 1";
        var cpf = "111111111";
        var foto = "base64";
        var dto = new VisitanteDTO(nome, cpf, foto);

        var tabelaVisitanteEmMemoria = new TabelaVisitanteEmMemoria();
        var visitanteService = new VisitanteService(tabelaVisitanteEmMemoria);

        assertDoesNotThrow(() -> visitanteService.cadastrar(dto));
    }
}
