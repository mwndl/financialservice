package financial.service.api.domain.pessoa;

import financial.service.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(
        @NotNull Long id,
        String nome,
        DadosEndereco endereco) {
}
