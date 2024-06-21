package strategy.solution;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;
import strategy.problem.ReajusteAnualSalario;

import java.math.BigDecimal;

public class TesteAjusteSalarialComStrategy
{
    public static void main(String[] args)
    {

        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
        Funcionario funcCLT = new Funcionario();
        funcCLT.setNome("Zé");
        funcCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcCLT.setSalario(new BigDecimal(5000));

        Funcionario funcPJ = new Funcionario();
        funcPJ.setNome("Ulisses");
        funcPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcPJ.setSalario(new BigDecimal(10000));

        Funcionario funcESTAGIARIO = new Funcionario();
        funcESTAGIARIO.setNome("Luiz Fabiano de Souza");
        funcESTAGIARIO.setTipoContratacao(TipoContratacaoEnum.ESTSAGIO);
        funcESTAGIARIO.setSalario(new BigDecimal(15000));

        // Reajustes
        reajusteAnualSalario.calcularReajusteAnual(funcCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calcularReajusteAnual(funcPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calcularReajusteAnual(funcESTAGIARIO, new CalculadorReajusteAnualSalarioESTAGIARIO() );

        System.out.println(funcCLT);
        System.out.println(funcPJ);
        System.out.println(funcESTAGIARIO);

    }
}
