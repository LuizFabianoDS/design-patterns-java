package adapter.problem;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente
{
    public static void main(String[] args)
    {
        // Objeto simulando um JAR
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        // Criando um cliente com um jar como parametro
        ClienteJarOperacoresContaCorrente client = new ClienteJarOperacoresContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        // Se validaSaldo for true
        if(client.validaSaldo(valorPretendidoParaSaque))
        {
            // Cliente saca o valor pretendido
            client.saca(valorPretendidoParaSaque);
        }

        // Depositar o valor
        client.deposita(new BigDecimal(500));

    }
}
