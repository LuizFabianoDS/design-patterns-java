package proxy.problem;

import builder.solution.Pessoa;
import proxy.solution.PessoaRepositoryProxy;

import java.time.LocalDate;

public class PessoaTest
{

    public static void main(String[] args)
    {

        /*
        // Criando ume pessoa service e injetando um PessoRespository
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

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

         */
    }
}

