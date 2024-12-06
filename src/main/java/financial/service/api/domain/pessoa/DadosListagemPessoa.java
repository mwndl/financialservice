package financial.service.api.domain.pessoa;

import financial.service.api.domain.endereco.Endereco;

public record DadosListagemPessoa(Long id,
                                  String nome,
                                  Endereco endereco) {

    public DadosListagemPessoa(Pessoa pessoa) {
        this(pessoa.getId(),
             pessoa.getNome(),
             pessoa.getEndereco());
    }
}
