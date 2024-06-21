package adapter.problem;

import java.math.BigDecimal;

public class ClienteJarOperacoresContaCorrente
{
     // Simulando um jar
    private JarOperacoesContaCorrente jocc;

    public ClienteJarOperacoresContaCorrente (JarOperacoesContaCorrente jocc)
    {
        this.jocc = jocc;
    }

    public boolean validaSaldo (BigDecimal valorPretendidoSaque)
    {
        return jocc.validaSaldo(valorPretendidoSaque);
    }

    public void saca (BigDecimal valorPretendido)
    {
        jocc.saca(valorPretendido);
    }

    public void deposita (BigDecimal valor)
    {
        jocc.deposita(valor);
    }

}
