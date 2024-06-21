package adapter.solution;

import adapter.problem.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter
{
    // Cria um objeto JarOpContaC
    private JarOperacoesContaCorrente jarConta;

    // Construtor da classe JarOpCCorAdapt
    // passando como parâmetro um objeto JarOpContaCorrente
    public JarOperacoesContaCorrenteAdapter (JarOperacoesContaCorrente jarConta)
    {
        // Atribuindo o ob jeto
        this.jarConta = jarConta;
    }

    public void saca (BigDecimal valorPretendido)
    {
        // Se a validação for true
        if(jarConta.validaSaldo(valorPretendido))
        {
            // Jar saca o valor
            jarConta.saca(valorPretendido);
        }
        else
        {
            // Exception do java para valor não permitido
            throw new IllegalArgumentException("Valor para saque não permitido.");
        }

    }

    public void deposita (BigDecimal valor)
    {
        // Jar deposita valor
        jarConta.deposita(valor);
    }

}
