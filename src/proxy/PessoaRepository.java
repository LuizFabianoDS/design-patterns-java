package proxy;

import builder.solution.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository
{

    // Simulando um DB com um map de pessoas
    private Map<Long, Pessoa> banco = new HashMap<>();

    // Id do "banco"
    private static Long countId = 1L;


    // Salvando a pessoa no banco e incrementando o id
    public void save (Pessoa pessoa)
    {
        banco.put(countId++, pessoa);
    }

    // Buscando uma pessoa no banco pelo id
    public Pessoa findById(Long id)
    {
        try
        {
            // Esperando 3s
            Thread.sleep(3000);
        }
        catch (InterruptedException ex)
        {
            // Caso dê algum problema
            throw new RuntimeException(ex);
        }

        // Retornando a pessoa encontrada fazendo uma busca pelo id
        return banco.get(id);
    }


}
