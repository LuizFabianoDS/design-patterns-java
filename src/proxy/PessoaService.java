package proxy;

import builder.solution.Pessoa;
import proxy.solution.NovoPessoaRepositoryProxy;
import proxy.solution.PessoaRepositoryProxy;
import proxy.solution.ProxyPessoa;

public class PessoaService
{
    // Composição
    private ProxyPessoa proxyPessoa;

    // Construtor com injeção de dependências
    public PessoaService (PessoaRepositoryProxy proxyPessoa)
    {
        this.proxyPessoa = proxyPessoa;
    }

    // Salva a pessoa
    public void save (Pessoa pessoa)
    {
        proxyPessoa.save(pessoa);
    }

    // Recebe o id e retorna a pessoa encontrada
    public Pessoa findById (Long id)
    {
        return proxyPessoa.findById(id);
    }
}
