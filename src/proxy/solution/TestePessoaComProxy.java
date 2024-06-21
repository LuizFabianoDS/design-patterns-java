package proxy.solution;

import builder.solution.Pessoa;
import proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy
{
    public static void main(String[] args) {

        // Criando ume pessoa service e injetando um PessoRespository
        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();

        // Criando uma pessoa com o builder
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Luiz").sobrenome("Souza").apelido("Paulista")
                .documento("123.345.567-32").email("Luiz@gmail.com")
                .dataNascimento(LocalDate.of(2004,5,24))
                .build();

        // Usando a pessoaService para salvar a pessoa criada no map
        pessoaService.save(pessoa);

        // Criando uma pessoa e inserindo nela a pessoa retornada do map
        Pessoa pessoaReturn = pessoaService.findById(1L);
        System.out.println(pessoaReturn);


        // Nesse momento, a pessoa já existe e já foi adicionada ao cache.
        // o tempo de execução foi praticamente instantâneo, pos ele
        // buscou diretamente do cache
        Pessoa pessoaReturnCache = pessoaService.findById(1L);
        System.out.println(pessoaReturnCache);
    }
}
