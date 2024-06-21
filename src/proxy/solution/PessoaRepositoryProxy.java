package proxy.solution;

import builder.solution.Pessoa;
import proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements  ProxyPessoa
{
    // Criando uma classe estática logger que recebe os loggers da PessoaRepository
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();


    // Sobrescrevendo os métodos da super (Classe pai)
    @Override
    public void save(Pessoa pessoa)
    {
        log.info("Iniciando chamada do método save... ");
        super.save(pessoa);
        log.info("Chamada do método save finalizada... ");
    }

    @Override
    public Pessoa findById(Long id)
    {
        log.info("Está pegando do Pessoa repository...");
        log.info("Iniciando chamada do método findById... ");

        long inicio = System.currentTimeMillis();


        Pessoa pessoa = null;

        if(Objects.nonNull(cache.get(id)))
        {
            log.info("Está pegando do cache");
            pessoa = cache.get(id);
        }
        else
        {

            // Criando uma pessoa que recebe a pessoa retornada
            // do método da classe pai
            pessoa = super.findById(id);

            // Adicionando a pessoa encontrada ao cache
            cache.put(id,pessoa);
        }

        log.info("Chamada do método findById finalizada... ");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada... " + (fim - inicio) );


        //Retornando a pessoa encontrada
        return pessoa;
    }
}
