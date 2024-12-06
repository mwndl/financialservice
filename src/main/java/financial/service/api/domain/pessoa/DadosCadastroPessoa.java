package financial.service.api.domain.pessoa;

import financial.service.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(@NotBlank
                                  String nome,
                                  @NotNull @Valid
                                  DadosEndereco endereco) {
}
