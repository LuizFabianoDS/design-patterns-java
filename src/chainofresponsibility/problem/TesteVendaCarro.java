package chainofresponsibility.problem;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;

import java.math.BigDecimal;

public class TesteVendaCarro
{
    public static void main(String[] args) {
        VendaCarroService vendaCarroService = new VendaCarroService();

        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(90000.00));

        BigDecimal valorVenda1 = vendaCarroService.cacularValorVenda(carro1);
        System.out.println("Valor de venda Fusion: " + carro1.getPreco());
        System.out.println("Valor de venda Fusion após desconto: " + valorVenda1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40000.00));

        BigDecimal valorVenda2 = vendaCarroService.cacularValorVenda(carro2);
        System.out.println("Valor de venda Uno: " + carro2.getPreco());
        System.out.println("Valor de venda Uno após desconto: " + valorVenda2);


        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(200000.00));

        BigDecimal valorVenda3 = vendaCarroService.cacularValorVenda(carro3);
        System.out.println("Valor de venda Camaro: " + carro3.getPreco());
        System.out.println("Valor de venda Camaro após desconto: " + valorVenda3);
    }
}
