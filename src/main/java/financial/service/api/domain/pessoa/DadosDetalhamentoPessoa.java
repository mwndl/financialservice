package financial.service.api.domain.pessoa;

import financial.service.api.domain.endereco.Endereco;

public record DadosDetalhamentoPessoa(Long id,
                                      String nome,
                                      Endereco endereco) {

    public DadosDetalhamentoPessoa(Pessoa pessoa) {
        this(pessoa. getId(),
             pessoa.getNome(),
             pessoa.getEndereco());
    }
}
