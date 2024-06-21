package prototype.solucao;

import prototype.Botao;

public class BotaoFactory {


    // Método para clonar um botão já existente no programa
    public static Botao getInstance(Botao prototipo)
    {
        // Criando o botão
        Botao clone = new Botao();

        // Adicionando no botão os parâmetro recebidos do objeto
        // que enviado pelo parâmetro do método

        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        // Retornando o objeto
        return clone;
    }
}
