package strategy.solution;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy
{
    public void calcularReajusteAnual(Funcionario funcionario,CalculadorReajusteAnualSalario calculador)
    {
        calculador.calcularReajusteAnual(funcionario);
    }


}
