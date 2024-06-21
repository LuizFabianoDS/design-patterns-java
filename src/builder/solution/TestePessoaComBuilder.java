package builder.solution;

import java.time.LocalDate;

public class TestePessoaComBuilder
{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder().nome("luiz").sobrenome("souza")
                .documento("4237832489").email("luiz@gmail.com")
                .apelido("Paulista")
                .dataNascimento(LocalDate.of(2004, 05, 24))
                .build();


        System.out.println(pessoa);
    }
}
