package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoProrotype
{
    public static void main(String[] args) {

        // Criando um botão e retornando um botão existente de acordo com a chave inserida
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTÃO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTÃO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTÃO_AMARELO");
        System.out.println(botaoAmarelo);


        // Criando um novo botão durante o programa
        String chave = "BOTÃO_PRETO"; //Parâmetro de criação
        Botao botaoPreto = new Botao();  //Objeto criado

        //Atributos do botão
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(50);
        botaoPreto.setLargura(300);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

        //Método para adicionar o botão no mapeamento
        BotaoRegistry.addRegistry(chave,botaoPreto);

        // Buscando o botão que acabamos de criar e exibindo na tela suas
        // características
        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTÃO_PRETO");
        System.out.println(botaoPretoClone);
    }
}
