package adapter.solution;

import adapter.problem.ClienteJarOperacoresContaCorrente;
import adapter.problem.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter
{
    public static void main(String[] args)
    {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        // Objeto simulando um JAR
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);

        // Criando um cliente com um jar como parametro
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);


        client.saca(valorPretendidoParaSaque);


        // Depositar o valor
        client.deposita(new BigDecimal(500));


    }
}
