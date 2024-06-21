package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry
{
    // Cria uma objeto statico
    private static BotaoRegistry botaoRegistry;

    // Cria um mapeamento passando como chave uma string e o valor sendo um objeto
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static
    {
        // Para criar e adicionar botões pré definidos no momento
        // em que a classe se inicia

        Botao botaoAmarelo = new Botao();
        Botao botaoVermelho = new Botao();
        Botao botaoAzul = new Botao();

        REGISTRY.put("BOTÃO_AMARELO", botaoAmarelo);
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTÃO_VERMELHO", botaoVermelho);
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);


        REGISTRY.put("BOTÃO_AZUL", botaoAzul);
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(123);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

    }

    // Método que retorna um botão, tendo como parâmetor a string chave do mapeamento
    public static Botao getBotao(String chave)
    {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao)
    {
        // Criando um novo botão com os parâmetros inseridos
        REGISTRY.put(chave,botao);
    }
}
