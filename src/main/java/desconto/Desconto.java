package desconto;

import imposto.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public  Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public BigDecimal calculo(Orcamento orcamento) {
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.efetuarCalculo(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);
}
