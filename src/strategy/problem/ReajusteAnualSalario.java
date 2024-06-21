package strategy.problem;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario
{
    public void calcularReajusteAnual(Funcionario funcionario)
    {
        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        }
        else if(TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        }
        else if(TipoContratacaoEnum.ESTSAGIO.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
