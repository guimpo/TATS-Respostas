package atividade03;

/**
 *
 * @author paulo
 */
public class Proposta {
    
    float total;
    int numeroParcelas;
    float valorParcela;
    
    public Proposta() {}
    
    public Proposta(float total, int numeroParcelas) {
        this.total = total;
        this.numeroParcelas = numeroParcelas;
        this.valorParcela = total / numeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
    
}
