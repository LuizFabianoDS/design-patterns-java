package adapter.solution;

import adapter.problem.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter
{
    // Simulando um jar
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter (JarOperacoesContaCorrenteAdapter jarContaAdapter)
    {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca (BigDecimal valorPretendido)
    {
        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita (BigDecimal valor)
    {
        jarContaAdapter.deposita(valor);
    }

}
