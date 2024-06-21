package prototype.problem;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAzul extends Botao
{
    public BotaoAzul()
    {
        setCor("Azul");
        setAltura(35);
        setLargura(123);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
