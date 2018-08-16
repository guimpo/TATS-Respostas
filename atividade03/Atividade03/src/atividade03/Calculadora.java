package atividade03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */
public class Calculadora {

    public List<Proposta> calcular(float valorEmprestimo) {
        ArrayList<Proposta>  propostas = new ArrayList<>();
        
        if(valorEmprestimo <= 1000) {
            Proposta p1 = new Proposta(1600f, 2);
            Proposta p2 = new Proposta(1600f, 3);
            propostas.add(p1);
            propostas.add(p2);
        } else if(valorEmprestimo <= 5000) {
            Proposta p1 = new Proposta(2340f, 2);
            Proposta p2 = new Proposta(2700f, 4);
            Proposta p3 = new Proposta(2700f, 10);
            propostas.add(p1);
            propostas.add(p2);
            propostas.add(p3);
        } else {
            
        }
        
        
        return propostas;
    }
}
