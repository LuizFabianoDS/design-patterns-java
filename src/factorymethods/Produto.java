package factorymethods;

import java.math.BigDecimal;

public class Produto
{
    private String descricao;
    private BigDecimal preco;
    private boolean possuiDimensoesFisicas;

    public Produto(String descricao, BigDecimal preco, boolean possuiDimensoesFisicas) {
        this.descricao = descricao;
        this.preco = preco;
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isPossuiDimensoesFisicas() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoesFisicas(boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
