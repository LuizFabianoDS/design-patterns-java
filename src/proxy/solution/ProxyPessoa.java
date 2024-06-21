package proxy.solution;

import builder.solution.Pessoa;

public interface ProxyPessoa
{


    // Método abstratos para
    // salvar a pessoa no banco e incrementando o id
    void save (Pessoa pessoa);


    // Método abstratos para
    // Buscando uma pessoa no banco pelo id
    Pessoa findById(Long id);

}
